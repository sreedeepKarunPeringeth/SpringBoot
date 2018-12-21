package com.spring.springbootdemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.springbootdemo.bean.Employee;

@Repository
public class DataDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Employee> retrieveAllEmployees(){
		
		return jdbcTemplate.query("Select * from Employee", new BeanPropertyRowMapper<Employee>(Employee.class));
	}
}
