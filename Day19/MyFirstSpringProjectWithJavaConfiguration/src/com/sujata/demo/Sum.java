package com.sujata.demo;

public class Sum implements Operator {

	@Override
	public long operate(int number1, int number2) {
		
		return number1+number2;
	}

}
