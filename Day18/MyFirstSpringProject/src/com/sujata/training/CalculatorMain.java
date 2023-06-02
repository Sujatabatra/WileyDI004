package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.Operator;
import com.sujata.demo.Sum;

public class CalculatorMain {

	public static void main(String[] args) {
		
		/*
		 * Spring Statement:
		 * Need not to create objects ,I am going to create objects for you : IOC 
		 * SpringContainer is responsible for creating Objects and Maintaining life cycle of Objects/Components for you.
		 * 
		 * What is Spring Container?
		 * Spring Container is the Object of ApplicationContext  
		 */
		
		/*
		 * ApplicationContext read calculator.xml and create objects for all the classes mentioned in <bean> tag and 
		 * give each object the name mentioned in id attribute of <bean>tag
		 */
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("calculator.xml");
		
//		Opretaor operator1=new Sum();
//		Operator operator1=(Operator)springContainer.getBean("multiply");
//		
//		System.out.println("Result : "+operator1.operate(10, 20));
		
//		Calculator calculator=new Calculator();
		
		Calculator calculator=(Calculator)springContainer.getBean("sumCalculator");
		calculator.showResult(10, 20);

	}

}
