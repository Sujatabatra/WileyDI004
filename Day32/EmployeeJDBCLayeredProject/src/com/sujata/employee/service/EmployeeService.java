package com.sujata.employee.service;

import java.util.List;

import com.sujata.employee.entity.Employee;

public interface EmployeeService {

	List<Employee> getAllEmployees();
	
	boolean addEmployee(Employee employee);
	
	boolean deleteEmployeeById(int id);
	
	boolean incrementEmployeeSalary(int id,int increment);
}
