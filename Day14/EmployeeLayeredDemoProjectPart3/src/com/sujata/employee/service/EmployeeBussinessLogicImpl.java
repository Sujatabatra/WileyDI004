package com.sujata.employee.service;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;
import com.sujata.employee.exception.EmployeeIdNotFoundException;
import com.sujata.employee.persistence.EmployeeDataAccess;
import com.sujata.employee.persistence.EmployeeDataAccessImpl;

public class EmployeeBussinessLogicImpl implements EmployeeBussinessLogic {

	
	private EmployeeDataAccess dataAccess=new EmployeeDataAccessImpl();
	
	private LinkedList<Employee> employeeList;
	
	public EmployeeBussinessLogicImpl() {
		try {
			employeeList=dataAccess.readRecords();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public LinkedList<Employee> getAllEmployees() {
		
		return employeeList;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		
		return employeeList.add(employee);
	}

	@Override
	public void deleteEmployee(int id)throws EmployeeIdNotFoundException {
		boolean status=false;
		
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId())
				status=employeeList.remove(employee);
		}
		
		if(status==false)
			throw new EmployeeIdNotFoundException("employee id "+id+" not found");
	}
	
	public void saveAllEmployees() {
		
			dataAccess.writeRecords(employeeList);
		
	}
	

}
