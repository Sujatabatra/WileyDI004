package com.sujata.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sujata.demo.Operator;
import com.sujata.demo.Product;

@Component("sumCalculator")
public class Calculator {

	private Operator operator;
	
	public Calculator(@Autowired @Qualifier("add") Operator operator) {
		super();
		this.operator = operator;
	}

	public void showResult(int number1,int number2) {
		long result=operator.operate(number1, number2);
		System.out.println("Result : "+result);
	}
}
