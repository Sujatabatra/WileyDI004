package com.sujata.model.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public long add(int number1, int number2) {
		return number1+number2;
	}

	@Override
	public int minus(int number1, int number2) {
		return number1-number2;
	}

	@Override
	public long multiply(int number1, int number2) {
		return number1*number2;
	}

	@Override
	public int divide(int number1, int number2) {
		return number1/number2;
	}

}
