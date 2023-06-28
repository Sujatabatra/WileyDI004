package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata")

public class EmployeeRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestApiApplication.class, args);
	}

}
