package com.sujata.demo;

import com.sujata.exception.NegativeNumberException;

public class Calculator {

	/*
	 * Requirement (R001)
	 * divide will divide two positive integers
	 * if number1 is negative : NegativeNumberException
	 * if number2 is negative : NegativeNumberException
	 * 
	 */
	public int divide(int number1,int number2)throws NegativeNumberException {
		
		if(number1>=0 && number2>=0)
			return number1/number2;
		else
			throw new NegativeNumberException("Number cannot be Negative");
		
	}
}
