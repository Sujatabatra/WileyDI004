package com.sujata.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.Employee;
import com.sujata.model.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	public Employee searchEmployeeById(int id) {
		return employeeDao.getRecordById(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean insertEmployee(Employee employee) {
		return employeeDao.saveRecord(employee)>0;
	}

	@Override
	public Employee deleteEmployee(int id) {
		Employee employee=searchEmployeeById(id);
		
		if(employee!=null)
			employeeDao.deleteRecord(id);
		
		return employee;
	}

	@Override
	public Employee updateEmployeeSlary(int id, int salary) {
		if(employeeDao.updateSalaryofRecord(id, salary)>0)
			return searchEmployeeById(id);
		return null;
	}

}
