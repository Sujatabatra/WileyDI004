package com.sujata.training;

//Subclass in same package
public class Grade extends Marks {

	private double percentage;
	private String grade;
	
	public Grade() {
		//implicit call to parent default constructor : super()- implicit call
		/*
		 * if parent class don't have default constructor,
		 * we need to explicitly call available/visible constructor with super() keyword
		 */
//		System.out.println("hello");
		super(0,0,0);
		System.out.println("Hi I am default constructor in Grade Class");
	}
	
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public void calculateGrade() {
		percentage=(getMarks1()+getMarks2()+getMarks3())/3;
		if(percentage>=75)
			grade="A Grade";
		else
			grade="B Grade";
	}
	
	public void displayStudentsDataWithGrade() {
		displayStudentDataWithMarks();
		System.out.println("Percentage : "+percentage);
		System.out.println("Grade : "+grade);
	}
}
