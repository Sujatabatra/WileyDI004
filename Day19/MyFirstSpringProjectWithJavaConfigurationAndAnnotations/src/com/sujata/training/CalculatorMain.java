package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.Operator;
import com.sujata.demo.Sum;

public class CalculatorMain {

	public static void main(String[] args) {
		
		
//		ApplicationContext springContainer=new ClassPathXmlApplicationContext("calculator.xml");
		
		AnnotationConfigApplicationContext springContainer=new AnnotationConfigApplicationContext(CalculatorConfig.class);
		Calculator calculator=(Calculator)springContainer.getBean("sumCalculator");
		calculator.showResult(10, 20);
		
		Calculator calculator1=(Calculator)springContainer.getBean("multiplyCalculator");
		calculator1.showResult(10, 20);
		

	}

}
