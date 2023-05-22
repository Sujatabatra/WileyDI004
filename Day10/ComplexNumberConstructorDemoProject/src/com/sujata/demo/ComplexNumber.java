package com.sujata.demo;

/*
 * Constructors are used to initialize the objects while declaring them as well
 * 
 * Rules for creating Constructor
 * 1. Constructor name would be same as that of your class name
 * 2. Constructor can be argumented as well as non argumented
 * 3. Constructor don't have return type not even void
 * 4. Constructor can exist in any scope i.e public, protected as well default
 * 
 * Note: if class is constructor challenged(class with no constructor), then
 * compiler will create default no argument constructor for us.
 * 
 * In a class we can have multiple constructors, 
 * one constructor will be differentiated from other
 * w.r.t the signature of constructor
 * 
 * Signature of constructor : Number of arguments, type of arguments and sequence of arguments
 */
public class ComplexNumber {

	private int real,imagenary;

	/*
	 * Constructor Overloading
	 */
	private ComplexNumber() {
//		real=0;
//		imagenary=0;
	}
	public ComplexNumber(int real, int imagenary) {
		this.real = real;
		this.imagenary = imagenary;
	}

	ComplexNumber(int real) {
		this.real=real;
		
	}
	
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
//		ComplexNumber complexNumber=new ComplexNumber();
		this.real=c1.real+c2.real;
		this.imagenary=c1.imagenary+c2.imagenary;
	}
}
