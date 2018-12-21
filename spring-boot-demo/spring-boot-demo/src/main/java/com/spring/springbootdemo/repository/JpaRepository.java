package com.spring.springbootdemo.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.spring.springbootdemo.bean.Employee;

@Repository
@Transactional
public class JpaRepository {
	
	@PersistenceContext
	EntityManager  entityManager;
	
	public List<Employee> retrieveAllEmployees(){
		
		TypedQuery<Employee> result= entityManager.createNamedQuery("findAllEmployees",Employee.class);
		return result.getResultList();
	}

}
