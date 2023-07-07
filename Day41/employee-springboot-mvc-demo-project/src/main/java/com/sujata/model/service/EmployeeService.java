package com.sujata.model.service;

import java.util.List;

import com.sujata.dto.entity.Employee;

public interface EmployeeService {

	Employee getEmployeeById(int empId);
	List<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
}