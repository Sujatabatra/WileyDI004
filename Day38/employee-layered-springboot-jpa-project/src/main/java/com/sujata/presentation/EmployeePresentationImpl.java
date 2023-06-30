package com.sujata.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sujata.dto.entity.Employee;
import com.sujata.service.EmployeeService;


@Component
public class EmployeePresentationImpl implements EmployeePresentation {

	@Autowired
	private EmployeeService employeeService;
	
	@Override
	public void showMenu() {
		System.out.println("1. Add New Employee");
		System.out.println("2. List All Employees ");
		System.out.println("3. Search Employee By ID");
		System.out.println("4. Delete Employee By ID");
		System.out.println("5. Increment Employee Salary");
		System.out.println("6. Exit");

	}

	@Override
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch (choice) {
		case 1:
			Employee employee=new Employee();
			
			System.out.println("Enter Employee ID : ");
			employee.setEmpId(scanner.nextInt());
			System.out.println("Enter Employee Name : ");
			employee.setEmpName(scanner.next());
			System.out.println("Enter Employee Designation : ");
			employee.setDesignation(scanner.next());
			System.out.println("Enter Employee Department : ");
			employee.setDepartment(scanner.next());
			System.out.println("Enter Employee Salary : ");
			employee.setSalary(scanner.nextDouble());
			
			if(employeeService.insertEmployee(employee)!=null)
				System.out.println("Employee Added");
			else
				System.out.println("Employee Not Added");
			break;

		case 2:
			List<Employee> employees=employeeService.getAllEmployees();
			for(Employee emp:employees) {
				System.out.println(emp);
			}
			break;
		case 3:
			System.out.println("Enter Employee ID : ");
			int id=scanner.nextInt();
			Employee searchedEmployee=employeeService.searchEmployeeById(id);
			if(searchedEmployee!=null)
				System.out.println(searchedEmployee);
			else
				System.out.println("Employee with id "+id+" does not exist");
			break;
		case 4:
			System.out.println("Enter Employee ID : ");
			int empId=scanner.nextInt();
			if(employeeService.deleteEmployeeById(empId)!=null)
				System.out.println("Employee Deleted with id "+empId);
			else
				System.out.println("Employee with id "+empId+" does not exist");
			break;
		case 5:
			System.out.println("Enter Employee ID : ");
			int eId=scanner.nextInt();
			System.out.println("Enter Increment Amount :");
			int incrementAmount=scanner.nextInt();
			Employee incrementedSalariedEmployee=employeeService.incrementEmployeeSalary(eId, incrementAmount);
			if(incrementedSalariedEmployee!=null) {
				System.out.print("After Increment Employee Details : ");
				System.out.println(incrementedSalariedEmployee);
			}
			else
				System.out.println("Employee with id "+eId+" does not exist for salary increment");
			break;
		case 6:
			System.out.println("Thanks for using Employee Management System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}

	}

}
