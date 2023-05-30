package com.sujata.demo;

public class EnumCoffeeMain {

	public static void main(String[] args) {
		Coffee coffee;
		
		coffee=Coffee.SMALL;
		
		System.out.println("Customer ordered "+coffee+" sized coffee ,which serve "+coffee.getSize()+" ounces of coffeee , kindly pay "+coffee.getPrice());
		

	}

}
