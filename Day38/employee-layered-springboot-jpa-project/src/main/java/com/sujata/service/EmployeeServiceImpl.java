package com.sujata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.dto.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;

	@Override
	public Employee insertEmployee(Employee employee) {
		// save : save or update
		if (searchEmployeeById(employee.getEmpId()) == null)
			return employeeDao.save(employee);
		else
			return null;

	}

	@Override
	public List<Employee> getAllEmployees() {

		return employeeDao.findAll();

	}

	@Override
	public Employee searchEmployeeById(int empId) {
		// Optional class : polisged way of dealing with null and orElse is the method
		// of Optional Class, Optional Class introduced in 1.8
		Employee employee = employeeDao.findById(empId).orElse(null);
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int empId) {
		Employee employee = searchEmployeeById(empId);
		if (employee != null)
			employeeDao.deleteById(empId);
		return employee;
	}

	@Override
	public Employee incrementEmployeeSalary(int empId, int incrementAmount) {
		Employee employee = searchEmployeeById(empId);
		if (employee != null) {
			employee.setSalary(employee.getSalary() + incrementAmount);
			employeeDao.save(employee);
		}
		return employee;
	}

}
