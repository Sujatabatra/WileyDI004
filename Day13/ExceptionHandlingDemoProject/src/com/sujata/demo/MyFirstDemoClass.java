package com.sujata.demo;

import java.util.Scanner;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("Enter First Number : ");
			int number1=scanner.nextInt();
		
			System.out.println("Enter Second Number : ");
			int number2=scanner.nextInt();
		
			int divide=number1/number2;   //exception : program terminates
		
			System.out.println("Division Result : "+divide);
		}
		//handler for that exception
		catch(ArithmeticException ex) {
			System.out.println("Undefined");
		}
		//Generic handler for all the exceptions other then the specified handlers above
		catch(Exception ex) {
			System.out.println("Somthing went wrong , please try again!");
		}
		System.out.println("Good Bye!");

	}

}
