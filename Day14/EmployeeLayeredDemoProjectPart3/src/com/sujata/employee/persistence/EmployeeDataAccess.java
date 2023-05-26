package com.sujata.employee.persistence;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;

public interface EmployeeDataAccess {

	public boolean writeRecords(LinkedList<Employee> employees);
	public LinkedList<Employee> readRecords();
}
