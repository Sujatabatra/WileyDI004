package com.sujata.demo;

import java.util.Scanner;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Factorial factorial=new Factorial();
		
		System.out.println("Enter Number : ");
		int number=scanner.nextInt();
		
		factorial.setNumber(number);
		System.out.println("Factorial of "+number+" = "+factorial.getFactorial());

	}

}
