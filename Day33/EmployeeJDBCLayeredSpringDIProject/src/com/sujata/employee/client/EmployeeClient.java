package com.sujata.employee.client;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sujata.employee.presentation.EmployeeUserInterface;
import com.sujata.employee.presentation.EmployeeUserInterfaceImpl;

public class EmployeeClient {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(EmployeeConfiguration.class);
		EmployeeUserInterface employeeUserInterface=(EmployeeUserInterface)springContainer.getBean("empPresentation");
		Scanner  scanner=new Scanner(System.in);
		while(true) {
			employeeUserInterface.showMenu();
			System.out.println("Enter Choice : ");
			int choice=scanner.nextInt();
			employeeUserInterface.performMenu(choice);
			
		}

	}

}
