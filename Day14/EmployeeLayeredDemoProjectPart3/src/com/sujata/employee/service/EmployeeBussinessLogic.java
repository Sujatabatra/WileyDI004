package com.sujata.employee.service;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;
import com.sujata.employee.exception.EmployeeIdNotFoundException;

public interface EmployeeBussinessLogic {

	LinkedList<Employee> getAllEmployees();
	boolean addEmployee(Employee employee);
	void deleteEmployee(int id) throws EmployeeIdNotFoundException;
	public void saveAllEmployees();
}
