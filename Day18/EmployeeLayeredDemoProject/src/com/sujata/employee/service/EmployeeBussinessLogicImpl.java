package com.sujata.employee.service;

import java.util.LinkedList;

import com.sujata.employee.dto.Employee;
import com.sujata.employee.persistence.EmployeeDataAccess;
import com.sujata.employee.persistence.EmployeeDataAccessImpl;

public class EmployeeBussinessLogicImpl implements EmployeeBussinessLogic {

	//Hardcorded the dependency
//	private EmployeeDataAccess dataAccess=new EmployeeDataAccessImpl();
	
	private EmployeeDataAccess dataAccess;
	
	//instance block : block which will get executed everytime before each constructor call
	{
		try {
			employeeList=EmployeeDataAccessImpl.readRecords();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public EmployeeBussinessLogicImpl(EmployeeDataAccess dataAccess) {
		super();
		this.dataAccess = dataAccess;
		
	}

	private LinkedList<Employee> employeeList;
	
	
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
