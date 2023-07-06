package com.sujata.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sujata")
public class SecondSpringbootMvcDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondSpringbootMvcDemoProjectApplication.class, args);
	}

}
