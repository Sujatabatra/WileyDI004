package com.sujata.training;

import com.sujata.demo.Student;

//Subclass In Different Package
public class Marks extends Student {

	private int marks1;
	private int marks2;
	private int marks3;
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
	public void inputStudentDataWithMarks(int rollNo,String name,int marks1,int marks2,int marks3) {
		inputStudentData(rollNo, name);
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
	}
	
	public void displayStudentDataWithMarks() {
		displayStudentData();
		System.out.println("Marks 1 : "+marks1);
		System.out.println("Marks 2 : "+marks2);
		System.out.println("Marks 3 : "+marks3);
	}
}
