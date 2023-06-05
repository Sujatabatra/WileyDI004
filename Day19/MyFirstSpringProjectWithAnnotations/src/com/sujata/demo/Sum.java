package com.sujata.demo;

import org.springframework.stereotype.Component;

@Component("add")
public class Sum implements Operator {

	@Override
	public long operate(int number1, int number2) {
		
		return number1+number2;
	}

}
