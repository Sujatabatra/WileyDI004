package com.sujata.demo;

/*
 * To Communicate design decisions programitically
 * 
 * Abstract can be a class or can be a method
 * we cannot instantiate i.e., create object of abstract class
 * abstract method is the contract which we share with child class, which child class is supposed to fulfill.
 * abstract method have no body
 *
 * if a class have even one abstract method then its mandatory to mark class as abstract.
 */
abstract public class Car {

	private String model,color;

	public Car(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	abstract public void engine() ;
}
