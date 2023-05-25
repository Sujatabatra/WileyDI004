package com.sujata.employee.client;

import java.util.Scanner;

import com.sujata.employee.presentation.EmployeeUserInterface;
import com.sujata.employee.presentation.EmployeeUserInterfaceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		EmployeeUserInterface employeeUserInterface=new EmployeeUserInterfaceImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeeUserInterface.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
			
		}

	}

}
