package com.sujata.training;

import com.sujata.demo.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student=new Student();
		student.inputStudentData(111, "ABCD");
		student.displayStudentData();
		
		System.out.println("============");
		
		Marks studentMarks=new Marks();
		studentMarks.inputStudentDataWithMarks(112, "AAAAA", 89, 90, 45);
		studentMarks.displayStudentDataWithMarks();
		
		System.out.println("=================");
		
		Grade grade=new Grade();
		grade.inputStudentDataWithMarks(100, "BBBB", 90, 67, 85);
		grade.calculateGrade();
		grade.displayStudentsDataWithGrade();

	}

}
