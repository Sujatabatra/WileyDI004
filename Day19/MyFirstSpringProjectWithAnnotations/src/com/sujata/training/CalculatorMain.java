package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.Operator;
import com.sujata.demo.Sum;

public class CalculatorMain {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext();
		springContainer.scan("com.sujata");
		springContainer.refresh();

		
		Calculator calculator=(Calculator)springContainer.getBean("sumCalculator");
		calculator.showResult(10, 20);

	}

}
