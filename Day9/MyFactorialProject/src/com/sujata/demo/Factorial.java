package com.sujata.demo;

public class Factorial {
	
	private int number;
	private int factorial;
	
	public void setNumber(int number) {
		this.number = number;
	}
	public int getFactorial() {
		calulateFactorial();
		return factorial;
	}
	
	private void calulateFactorial() {
		factorial=1;
		while(number>=1) {
			factorial*=number--;
		}
	}

}
