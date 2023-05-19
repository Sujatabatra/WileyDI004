package com.sujata.training;

import java.util.Scanner;
import com.sujata.demo.Factorial;

public class FactorialMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Factorial factorial=new Factorial();
		
		System.out.println("Enter Number : ");
		factorial.setNumber(scanner.nextInt());
		
		System.out.println("Factorial "+factorial.getFactorial());

	}

}
