package com.sujata.demo;

@FunctionalInterface
interface Greet{
	public void wish(String name);
}

public class MyFirstDemoClass {

	public static void main(String[] args) {
		
//		Greet greet=(name)->{
//		System.out.println("Welcome "+name);
//		};
		
//		Greet greet=(name)->System.out.println("Welcome "+name);

		Greet greet=name->System.out.println("Welcome "+name);
		greet.wish("Dominique");
		
	}

}
