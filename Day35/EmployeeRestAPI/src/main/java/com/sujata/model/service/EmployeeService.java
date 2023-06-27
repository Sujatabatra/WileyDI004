package com.sujata.model.service;

import java.util.List;

import com.sujata.dto.entity.Employee;

public interface EmployeeService {

	public Employee searchEmployeeById(int id);
	public List<Employee> getAllEmployees();
	public boolean insertEmployee(Employee employee);
	public Employee deleteEmployee(int id);
	public Employee updateEmployeeSlary(int id,int salary);
}
