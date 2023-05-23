package com.sujata.demo;

public class CarRental {

	public static void main(String[] args) {
		Audi audi=new Audi("A8", "Red");
		BMW bmw=new BMW("Q7", "Blue");
		Hyundai hyundai=new Hyundai("Verna", "White");
		
		
		Driver shifahu=new Driver("Shifahu");
		Driver rosie=new Driver("Rosie");
		Driver lily=new Driver("Lily");
		
		lily.setCar(audi);
		lily.drive();

	}

}
