package com.sujata.demo;

public class ButterPopCorn extends PopCorn {

	private int butterQuantity;

	public ButterPopCorn(int price, String name, int butterQuantity) {
		super(price, name);
		this.butterQuantity = butterQuantity;
	}

	public void pop() {
		System.out.println("Yummilicious Buttery order is ready for" + getName() + "with butter quantity "
				+ butterQuantity + " kindly pay " + getPrice());
	}

	public int getButterQuantity() {
		return butterQuantity;
	}

	public void setButterQuantity(int butterQuantity) {
		this.butterQuantity = butterQuantity;
	}

}
