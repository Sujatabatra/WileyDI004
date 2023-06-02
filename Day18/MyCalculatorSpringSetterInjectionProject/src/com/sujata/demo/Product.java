package com.sujata.demo;

public class Product implements Operator {

	@Override
	public long operate(int number1, int number2) {
		
		return number1*number2;
	}

}
