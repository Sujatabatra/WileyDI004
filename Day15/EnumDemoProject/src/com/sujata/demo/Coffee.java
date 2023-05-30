package com.sujata.demo;

public enum Coffee {

	SMALL(4, 5.6), LARGE(6, 7.9), OVERWHELMING(9, 8.5);

	private int size;
	private double price;

	private Coffee(int size, double price) {
		this.size = size;
		this.price = price;
	}

	public int getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}

}
