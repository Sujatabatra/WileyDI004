package com.sujata.training;

//Subclass in same package
public class Grade extends Marks {

	private double percentage;
	private String grade;
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
