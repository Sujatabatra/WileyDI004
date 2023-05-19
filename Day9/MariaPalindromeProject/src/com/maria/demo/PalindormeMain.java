package com.maria.demo;

import java.util.Scanner;

public class PalindormeMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		Palindrome palindrome=new Palindrome();
		
		System.out.println("Enter No : ");
		int number=scanner.nextInt();
		
		palindrome.setNumber(number);
		
		
		System.out.println("Is "+number+" palindrome : "+palindrome.isPalindrome());

	}

}
