package com.sujata.training;

import com.sujata.demo.Operator;
import com.sujata.demo.Product;

public class Calculator {

	//Depedency Logic
	/*
	 * IOC : Inversion of Control => separating the dependency logic from the actual logic of your application
	 * with the help of Dependency Injection
	 */
	private Operator operator;
	

	public void setOperator(Operator operator) {
		this.operator = operator;
	}
	
	public void showResult(int number1,int number2) {
		long result=operator.operate(number1, number2);
		System.out.println("Result : "+result);
	}

	
}
