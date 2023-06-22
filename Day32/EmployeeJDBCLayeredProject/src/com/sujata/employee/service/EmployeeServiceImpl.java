package com.sujata.employee.service;

import java.util.List;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.persistence.EmployeeDao;
import com.sujata.employee.persistence.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao=new EmployeeDaoImpl();
	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

}
