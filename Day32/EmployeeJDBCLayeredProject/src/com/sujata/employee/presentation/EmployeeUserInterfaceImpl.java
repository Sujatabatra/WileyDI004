package com.sujata.employee.presentation;

import java.util.List;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.service.EmployeeService;
import com.sujata.employee.service.EmployeeServiceImpl;

public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Exit");

	}

	@Override
	public void performMenu(int choice) {
		switch(choice) {
		case 1:
			List<Employee> empList=employeeService.getAllEmployees();
			for(Employee employee:empList)
			{
				System.out.println(employee);
			}
			break;
		case 2:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
