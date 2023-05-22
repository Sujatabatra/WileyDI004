package com.sujata.training;

import com.sujata.demo.Student;

public class StudentMain {

	public static void main(String[] args) {
		//Different class in different Package
//		Student student=new Student();
//		student.inputStudentData(111, "ABCD");
//		student.displayStudentData();
		
		System.out.println("============");
		
		Marks studentMarks=new Marks();
		studentMarks.inputStudentDataWithMarks(112, "AAAAA", 89, 90, 45);
		studentMarks.displayStudentDataWithMarks();

	}

}
