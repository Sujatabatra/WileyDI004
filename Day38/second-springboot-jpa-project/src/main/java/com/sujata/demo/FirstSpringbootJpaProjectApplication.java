package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.dto.entity.Employee;
import com.sujata.persistence.EmployeeDao;

@SpringBootApplication
@EntityScan(basePackages = "com.sujata.dto.entity")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class FirstSpringbootJpaProjectApplication implements CommandLineRunner {

	@Autowired
	EmployeeDao employeeDao;
	
	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		employeeDao.save(new Employee(101, "Antony", "Executive", "Sales", 56000));
		
	}

}
