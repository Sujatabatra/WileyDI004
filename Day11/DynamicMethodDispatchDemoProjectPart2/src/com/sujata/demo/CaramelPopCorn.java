package com.sujata.demo;

public class CaramelPopCorn extends PopCorn {

	private int caramelQuantity;

	public CaramelPopCorn(int price, String name, int caramelQuantity) {
		super(price, name);
		this.caramelQuantity = caramelQuantity;
	}

	public void pop() {
		System.out.println("Hot and Sizzling order is ready for" + getName() + "with caramel quantity "
				+ caramelQuantity + " kindly pay " + getPrice());
	}

	public int getCaramelQuantity() {
		return caramelQuantity;
	}

	public void setCaramelQuantity(int caramelQuantity) {
		this.caramelQuantity = caramelQuantity;
	}

}
