package com.maria.demo;

import com.sujata.demo.ReverseNumber;

public class Palindrome {

	private int number;
	private boolean palindrome;
	
	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isPalindrome() {
		checkPalindrome();
		return palindrome;
	}
	
	private void checkPalindrome() {
		
		ReverseNumber reverseNumber=new ReverseNumber();
		reverseNumber.setNumber(number);
		
		if(number==reverseNumber.getReverse())
			palindrome=true;
		else
			palindrome=false;
	}
	
}
