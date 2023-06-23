package com.sujata.employee.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.employee.entity.Employee;
import com.sujata.employee.service.EmployeeService;
import com.sujata.employee.service.EmployeeServiceImpl;

@Component("empPresentation")
public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	EmployeeService employeeService;
	
	
	public EmployeeUserInterfaceImpl(@Autowired EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}

	@Override
	public void showMenu() {
		System.out.println("1. Show All Employees");
		System.out.println("2. Add new Employee");
		System.out.println("3. Delete Employee By ID");
		System.out.println("4. Increment Salary of an Employee");
		System.out.println("5. Search Employee By ID");
		System.out.println("6. Exit");

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
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();

			if(employeeService.deleteEmployeeById(id))
				System.out.println("Employee Deleted");
			else
				System.out.println("Employee Not Deleted");
			break;
		case 4:
			System.out.println("Enter Employee ID : ");
			int eId=scanner.nextInt();
			System.out.println("Enter Increment Amount : ");
			int incrementAmount=scanner.nextInt();
			
			if(employeeService.incrementEmployeeSalary(eId, incrementAmount))
				System.out.println("Salary Incremented Successfully");
			else
				System.out.println("Unable to process salary increment");
			break;
		case 5:
			System.out.println("Enter Employee ID : ");
			int empId=scanner.nextInt();
			Employee searchedEmployee=employeeService.searchEmployeeByID(empId);
			if(searchedEmployee!=null)
				System.out.println(searchedEmployee);
			else
				System.out.println("Employee with id "+empId+" does not exist");
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
