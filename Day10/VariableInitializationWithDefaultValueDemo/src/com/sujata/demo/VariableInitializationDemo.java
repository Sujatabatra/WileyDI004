package com.sujata.demo;

public class VariableInitializationDemo {

	/*
	 * if a is instance variable, then a is initialized with default initial value
	 */
	private int a;
	
	public void dummyMethod() {
		System.out.println(" a : "+a);
		a=10;
	}

	public int getA() {
		return a;
	}
	
	public void demoLocalVariableMethod() {
		/*
		 * Local variables will not get default initial value
		 * and if you try to use local variables without initializing them,
		 * then compiler will report an error.
		 */
		int x;
//		System.out.println(" x : "+x);
		
	}
}
