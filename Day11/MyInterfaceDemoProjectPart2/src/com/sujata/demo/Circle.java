package com.sujata.demo;

public class Circle extends InputNumber implements RoundedShape, Show {

	private double area,circumference;
	
	public Circle(double value) {
		setValue(value);
	}
	
	@Override
	public void area() {
		area=Math.PI*getValue()*getValue();

	}

	@Override
	public void display() {
		System.out.println("Area of Circle : "+area);
		System.out.println("Circumference of Circle "+circumference);

	}

	@Override
	public void circumference() {
		circumference=Math.PI*2*getValue();

	}

}
