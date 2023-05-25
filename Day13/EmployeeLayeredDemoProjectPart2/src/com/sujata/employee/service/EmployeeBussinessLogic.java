package com.sujata.employee.service;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;

public interface EmployeeBussinessLogic {

	LinkedList<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	boolean deleteEmployee(int id);
	public void saveAllEmployees()throws Exception;
}
