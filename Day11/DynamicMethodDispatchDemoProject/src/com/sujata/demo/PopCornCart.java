package com.sujata.demo;

public class PopCornCart {

	private PopCorn popCorn;

	public void setPopCorn(PopCorn popCorn) {
		this.popCorn = popCorn;
	}

	public void buy() {
		System.out.print("Kindly Take your ");
		popCorn.pop();
	}
}
