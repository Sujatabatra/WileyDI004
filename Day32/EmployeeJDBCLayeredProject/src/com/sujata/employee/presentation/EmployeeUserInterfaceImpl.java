package com.sujata.employee.presentation;

import java.util.List;
import java.util.Scanner;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.service.EmployeeService;
import com.sujata.employee.service.EmployeeServiceImpl;

public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	EmployeeService employeeService=new EmployeeServiceImpl();
	
	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Add new Employee");
		System.out.println("3. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			List<Employee> empList=employeeService.getAllEmployees();
			for(Employee employee:empList)
			{
				System.out.println(employee);
			}
			break;
		case 2:
			Employee newEmployee=new Employee();
			
			System.out.println("Enter Employee ID : ");
			newEmployee.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			newEmployee.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			newEmployee.setEmpDesignation(scanner.next());
			System.out.println("Enter Employee Department : ");
			newEmployee.setEmpDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			newEmployee.setEmpSalary(scanner.nextDouble());
			if(employeeService.addEmployee(newEmployee))
				System.out.println("New Employee Added");
			else
				System.out.println("Employee Not Added");
			
			break;
		case 3:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
