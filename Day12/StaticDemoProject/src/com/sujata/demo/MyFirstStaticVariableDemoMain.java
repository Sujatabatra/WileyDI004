package com.sujata.demo;

public class MyFirstStaticVariableDemoMain {

	public static void main(String[] args) {
		
		System.out.println("value2 : "+MyFirstStaticVariableDemo.value2);
		MyFirstStaticVariableDemo.value2=20;
		System.out.println("value2 : "+MyFirstStaticVariableDemo.value2);
		
		MyFirstStaticVariableDemo obj1=new MyFirstStaticVariableDemo();
		
		System.out.println("value2 with obj1 : "+obj1.value2);

		System.out.println("value1 with obj1 : "+obj1.value1);
		
		MyFirstStaticVariableDemo obj2=new MyFirstStaticVariableDemo();

		obj2.value2=35;
		System.out.println("value2 with classname : "+MyFirstStaticVariableDemo.value2);
		System.out.println("value 2 with obj1 : "+obj1.value2);
		System.out.println("value2 with obj2 : "+obj2.value2);
	}

}
