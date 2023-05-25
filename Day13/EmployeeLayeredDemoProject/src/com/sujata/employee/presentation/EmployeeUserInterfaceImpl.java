package com.sujata.employee.presentation;

public class EmployeeUserInterfaceImpl implements EmployeeUserInterface {

	@Override
	public void showMenu() {
		System.out.println("1. List All Employees");
		System.out.println("2. Add New Employee");
		System.out.println("3. Delete Existing Employee");
		System.out.println("4. Exit");

	}

	@Override
	public void performMenu(int choice) {
		switch (choice) {
		case 1: 
			System.out.println("This module is under development");
			break;
		case 2:
			System.out.println("This Module is under development");
			break;
		case 3:
			System.out.println("This Module is under development");
			break;
		case 4:
			System.out.println("Thanks for Using Employee Management System");
			System.exit(0);
			
		default:
			System.out.println("Invalid Choice");
		}

	}

}
