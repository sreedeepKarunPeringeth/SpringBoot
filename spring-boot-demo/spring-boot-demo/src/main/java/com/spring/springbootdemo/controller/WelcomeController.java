package com.spring.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import com.spring.springbootdemo.bean.Employee;
import com.spring.springbootdemo.service.Business;

@RestController
public class WelcomeController {

	@Autowired
	private Business business;
	
	@GetMapping("/")
	public String welcome(){
		
		return "Welcome !!!";
	}
	
	
	@GetMapping("/getEmployees") 
	public List<Employee> getAllEmployees(){
		
		return business.retriveAllEmployees();
	}
	
	
	@PostMapping("/save")
	public int addEmployee(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("designation") String designation ){
		
		Employee employee = new Employee(id, name, designation);
		return business.saveEmployee( employee);
	}
	
	@PostMapping("/save2")
	public int addEmployee2(@RequestBody Employee employee ){
		System.out.println(employee.getEmployeeName());
		
		return business.saveEmployee( employee);
	}
	
	@PutMapping("/put")
	public int updateEmployee(@RequestBody Employee employee ){
		
		return business.updateEmployee( employee);
	}
	
}
