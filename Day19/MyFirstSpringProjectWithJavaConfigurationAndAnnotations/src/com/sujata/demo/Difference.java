package com.sujata.demo;

import org.springframework.stereotype.Component;

@Component("subtract")
public class Difference implements Operator {

	@Override
	public long operate(int number1, int number2) {
		
		return number1*number2;
	}

}
