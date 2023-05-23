package com.sujata.demo;

public class Audi extends Car {

	public Audi(String model, String color) {
		super(model, color);
	}
	
	//Annotation
	@Override
	public void engine() {
		System.out.println("Audi engine goes AOOOOM....");
	}

}
