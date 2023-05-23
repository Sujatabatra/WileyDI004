package com.sujata.demo;

public class Square implements Shape {

	private int side;
	
	
	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of Square : "+side*side);

	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Square : "+4*side);

	}

}
