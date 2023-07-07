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
	public Employee getEmployeeById(int empId) {
		return employeeDao.findById(empId).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public boolean addEmployee(Employee employee) {
		Employee emp=getEmployeeById(employee.getEmpId());
		if(emp==null) {
			employeeDao.save(employee);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteEmployeeById(int empId) {
		Employee emp=getEmployeeById(empId);
		if(emp!=null) {
			employeeDao.deleteById(empId);
			return true;
		}
		return false;
	}

}
