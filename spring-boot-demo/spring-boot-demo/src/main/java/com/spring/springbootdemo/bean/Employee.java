package com.spring.springbootdemo.bean;


//@Entity
//@NamedQuery(name="findAllEmployees", query="select e from Employee e")
//@NamedQuery(name="saveEmployee", query="")
public class Employee {

	//@Id
	//@GeneratedValue
	private int employeeId;
	private String employeeName;
	private String employeeDesignation;
	
	public Employee(int employeeId, String employeeName, String employeeDesignation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDesignation() {
		return employeeDesignation;
	}
	public void setEmployeeDesignation(String employeeDesignation) {
		this.employeeDesignation = employeeDesignation;
	}
	
	
}
