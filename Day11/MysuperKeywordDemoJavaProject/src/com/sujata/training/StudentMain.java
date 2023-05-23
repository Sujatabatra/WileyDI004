package com.sujata.training;

import com.sujata.demo.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.inputStudentData(111, "ABCD");
		student.displayStudentData();
		
		System.out.println("============");
		
		Marks studentMarks=new Marks();
		studentMarks.inputStudentData(112, "AAAAA", 89, 90, 45);
		studentMarks.displayStudentData();
		
		System.out.println("=================");
		
		Grade grade=new Grade();
		grade.inputStudentData(100, "BBBB", 90, 67, 85);
		grade.calculateGrade();
		grade.displayStudentsData();

	}

}
