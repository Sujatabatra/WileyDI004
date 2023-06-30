package com.sujata.service;

import java.util.List;

import com.sujata.dto.entity.Employee;

public interface EmployeeService {

	public Employee insertEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Employee searchEmployeeById(int empId);
	public Employee deleteEmployeeById(int empId);
	public Employee incrementEmployeeSalary(int empId,int incrementAmount);
	public List<Employee> getEmployeesByDepartment(String department);
	public List<Employee> getEmployeeByName(String name);
}
