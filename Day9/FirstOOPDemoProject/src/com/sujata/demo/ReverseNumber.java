package com.sujata.demo;


/*
 * 1. Decide all the input and output variables
 * 2. Decide which variable is supposed to be modifiable and which variable is supposed to be readable
 * 	For all the modifiable variables create setter methods
 * 	For all the readable variables create getter methods
 * 	For all modifiable as well as readable variable create both setter and getter methods
 * 
 */
/*
 * Class : Encapsulation
 * method: data abstraction
 * private access modifier :  data hiding
 */
public class ReverseNumber {

	/*
	 * number : modifiable : setter method
	 * reverse : readable : getter method
	 */
	private int number,reverse;

	
	public void setNumber(int number) {
		this.number = number;
	}

	public int getReverse() {
		calculateReverse();
		return reverse;
	}

	private void calculateReverse() {
		while(number>0) {
			reverse=reverse*10+number%10;
			number=number/10;
		}
	}
	
}
