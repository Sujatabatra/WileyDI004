package com.sujata.training;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.demo.Difference;
import com.sujata.demo.Product;
import com.sujata.demo.Sum;

@Configuration
public class CalculatorConfig {
	
//	<bean id="add" class="com.sujata.demo.Sum"></bean>
	@Bean("add")
	public Sum getSum() {
		return new Sum();
	}
	
//	<bean id="subtract" class="com.sujata.demo.Difference"></bean>
	@Bean
	public Difference subtract() {
		return new Difference();
	}
	
//	<bean id="multiply" class="com.sujata.demo.Product"></bean>
	@Bean
	public Product multiply() {
		return new Product();
	}
	
//	<bean id="sumCalculator" class="com.sujata.training.Calculator">
//	<constructor-arg  ref="add"></constructor-arg>
//	</bean>
	@Bean
	public Calculator sumCalculator() {
		return new Calculator(getSum());
	}
	
//	<bean id="multiplyCalculator" class="com.sujata.training.Calculator">
//	<constructor-arg  ref="multiply"></constructor-arg>
//	</bean>
	@Bean
	public Calculator mulCalculator() {
		return new Calculator(multiply());
	}
	

}
