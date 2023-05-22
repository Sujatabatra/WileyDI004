package com.sujata.demo;

public class Student {

	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void inputStudentData(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public void displayStudentData() {
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
	}
	
	
}
