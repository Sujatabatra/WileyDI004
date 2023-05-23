package com.sujata.demo;

public class PopCorn {

	private int price;
	private String name;

	public PopCorn(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public void pop() {
		System.out.println("Healthy order is ready for"+getName()+" kindly pay "+getPrice());
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
