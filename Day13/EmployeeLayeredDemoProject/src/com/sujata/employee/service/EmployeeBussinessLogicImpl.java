package com.sujata.employee.service;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;
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
	public boolean deleteEmployee(int id) {
		for(Employee employee:employeeList) {
			if(id==employee.getEmpId())
				return employeeList.remove(employee);
		}
		return false;
	}
	
	public void saveAllEmployees() {
		try {
			dataAccess.writeRecords(employeeList);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
