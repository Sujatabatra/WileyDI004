package com.sujata.client;



import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sujata.employee.presentation.EmployeeUserInterface;

//@SpringBootApplication : @Configuration + @ComnponentScan
@SpringBootApplication(scanBasePackages = "com.sujata")
public class SpringBootEmployeeJdbcLayeredProjectApplication {

	public static void main(String[] args) {
	ApplicationContext springContainer=SpringApplication.run(SpringBootEmployeeJdbcLayeredProjectApplication.class, args);
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
