package com.sujata.generics;

public class MainClass {

	public static void main(String[] args) {
		GenericInput<String> obj1=new GenericInput<String>();
		obj1.setValue("Sujata");
		System.out.println(obj1.getValue());
		
		GenericInput<Double> obj2=new GenericInput<Double>();
		obj2.setValue(34.5);
		System.out.println(obj2.getValue());
		
		GenericInput<Person> obj3=new GenericInput<Person>();
		obj3.setValue(new Person(101, "Roda"));
		/*
		 * whenever we try to print object with System.out.print(),
		 * implicit call goes to toString() method of Object class
		 */
		System.out.println(obj3.getValue());
		

	}

}
