package com.sujata.demo;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.presentation.EmployeePresentation;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.dto.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class EmployeeLayeredSpringbootJpaProjectApplication implements CommandLineRunner {

	@Autowired
	private EmployeePresentation employeePresentation;
	
	public static void main(String[] args) {
		SpringApplication.run(EmployeeLayeredSpringbootJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter choice : ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
		}
		
	}

}
