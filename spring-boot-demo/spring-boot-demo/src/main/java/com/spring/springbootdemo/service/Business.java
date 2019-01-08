package com.spring.springbootdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springbootdemo.bean.Employee;
import com.spring.springbootdemo.repository.DataDao;
import com.spring.springbootdemo.repository.JpaRepository;

@Service
public class Business {

	@Autowired
	private DataDao dataDao;
	
/*	@Autowired
	private JpaRepository jpaRepository;*/
	
	
	public List<Employee> retriveAllEmployees(){
		
		return dataDao.retrieveAllEmployees();
	}
	
	public int saveEmployee(Employee employee){
		
		return dataDao.saveEmployee( employee);
	}
	
	public int updateEmployee(Employee employee){
		
		return dataDao.updateEmployee( employee);
	}
	
	/*public List<Employee> retriveAllEmployees(){
		
		return jpaRepository.retrieveAllEmployees();
	}*/
	
	public List<Employee> deleteEmployee(int id){
		
		return dataDao.deleteEmployee(id);
	}
	
}
