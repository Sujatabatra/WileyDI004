package com.sujata.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.persistence.EmployeeDao;
import com.sujata.employee.persistence.EmployeeDaoImpl;

//@Component("empService")
@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	
	public EmployeeServiceImpl(@Autowired EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.getAllRecords();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		return employeeDao.addRecord(employee)>0;
	}

	@Override
	public boolean deleteEmployeeById(int id) {
		return employeeDao.deleteRecord(id)>0;
	}

	@Override
	public boolean incrementEmployeeSalary(int id, int increment) {
		return employeeDao.updateRecord(id, increment)>0;
	}

	@Override
	public Employee searchEmployeeByID(int id) {
		
		return employeeDao.searchRecordById(id);
	}

}
