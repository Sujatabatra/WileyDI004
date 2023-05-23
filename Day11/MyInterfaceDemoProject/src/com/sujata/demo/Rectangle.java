package com.sujata.demo;

public class Rectangle implements Shape {

	private int length,breadth;
	
	
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle : "+length*breadth);

	}

	@Override
	public void perimeter() {
		System.out.println("Perimeter of Rectangle : "+2*(length+breadth));

	}

}
