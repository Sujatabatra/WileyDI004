package com.sujata.dto.entity;

import java.util.List;

public class EmployeeList {

	private List<Employee> employees;
	
	public EmployeeList() {
		
	}

	public EmployeeList(List<Employee> employees) {
		super();
		this.employees = employees;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
}
