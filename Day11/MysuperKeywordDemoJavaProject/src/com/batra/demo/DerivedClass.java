package com.batra.demo;

//subclass same package
public class DerivedClass extends BaseClass {

	int value;
	
	public void input(int x,int y) {
		super.value=x;
		value=y;
	}
	
	public void display() {
		System.out.println("BaseClass value : "+super.value);
		System.out.println("Derived class value : "+value);
	}
}
