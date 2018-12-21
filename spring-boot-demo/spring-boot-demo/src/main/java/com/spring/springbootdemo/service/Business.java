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
	
	/*public List<Employee> retriveAllEmployees(){
		
		return jpaRepository.retrieveAllEmployees();
	}*/
	
}
