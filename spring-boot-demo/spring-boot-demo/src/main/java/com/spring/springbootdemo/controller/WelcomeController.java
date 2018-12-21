package com.spring.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
