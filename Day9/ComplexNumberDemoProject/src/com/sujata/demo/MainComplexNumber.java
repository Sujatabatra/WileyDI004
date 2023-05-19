package com.sujata.demo;

import java.util.Scanner;

public class MainComplexNumber {

	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
		
		/*
		 * declaration creates a reference variable in stack with value null
		 */
		ComplexNumber complexNumber1;  //Declaration
		/*
		 * Instance is another name for an Object
		 * 
		 * memory area allocated to all instance variables on heap 
		 * and all instance variables will be initialized with default as well
		 * Following are the default initial value for different kinds of instance variables
		 * byte,short,int and long =0
		 * float, double =0.0
		 * String=null
		 * boolean = false;
		 * char=/0000u
		 */
		complexNumber1=new ComplexNumber();  //Memory Allocation
//		System.out.println("Enter real for first complex number :");
//		int real=scanner.nextInt();
//		System.out.println("Enter imagenary for second complex number : ");
//		int imag=scanner.nextInt();
		complexNumber1.inputComplexNumber(5, 10);
		complexNumber1.displayComplexNumber();
		
		ComplexNumber complexNumber2=new ComplexNumber();
		complexNumber2.inputComplexNumber(6, -8);
		complexNumber2.displayComplexNumber();
		
		ComplexNumber complexNumber3=new ComplexNumber();
		complexNumber3.sum(complexNumber1, complexNumber2);
		
		complexNumber3.displayComplexNumber();
		

	}

}
