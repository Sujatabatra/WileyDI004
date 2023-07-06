package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.dto.entity")
@EnableJpaRepositories(basePackages = "com.sujata.model.persistence")
public class EmployeeSpringbootMvcDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringbootMvcDemoProjectApplication.class, args);
	}

}
