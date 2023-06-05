package com.sujata.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sujata.demo.Difference;
import com.sujata.demo.Product;
import com.sujata.demo.Sum;

@Configuration
@ComponentScan(basePackages = "com.sujata")
public class CalculatorConfig {
		
	@Bean
	public Product getProduct() {
		return new Product();
	}
	
	@Bean 
	public Calculator multiplyCalculator() {
		return new Calculator(getProduct());
	}
	
	
}
