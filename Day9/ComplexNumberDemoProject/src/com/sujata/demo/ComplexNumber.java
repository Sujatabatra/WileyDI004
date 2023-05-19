package com.sujata.demo;

/*
 * POJO:Plain Old Java Object
 * classes with private properties and 
 * public getter and setter methods :POJO/Java Beans
 */

public class ComplexNumber {

	private int real,imagenary;

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImagenary() {
		return imagenary;
	}

	public void setImagenary(int imagenary) {
		this.imagenary = imagenary;
	}
	
	public void inputComplexNumber(int real,int imagenary) {
		//initialize instance variables with the value of local variables
		this.real=real;
		this.imagenary=imagenary;
	}
	
	public void displayComplexNumber() {
		System.out.print(real);
		if(imagenary>0) {
			System.out.println("+"+imagenary+"i");
		}
		else if(imagenary<0) {
			System.out.println(imagenary+"i");
		}
	}
	
	public void sum(ComplexNumber c1,ComplexNumber c2) {
		this.real=c1.real+c2.real;
		this.imagenary=c1.imagenary+c2.imagenary;
	}
}
