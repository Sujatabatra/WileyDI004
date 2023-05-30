package com.sujata.demo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MyFirstDemoClass {

	public static void main(String[] args) {
		//yyyy-MM-dd
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		
		localDate=LocalDate.parse("2023-05-03");
		System.out.println(localDate);
		
		localDate=LocalDate.parse("05/03/2021",DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		System.out.println("Localdate : "+localDate);
		
		String isoDate=localDate.toString();
		System.out.println(isoDate);
		
		String formatter=localDate.format(DateTimeFormatter.ofPattern("MM=dd=yyyy"));
		System.out.println(formatter);
		
		LocalDate pastDate=localDate.minusDays(10);
		System.out.println(pastDate);
		
		LocalDate pastMonth=localDate.minusMonths(3);
		
		Period difference =pastDate.until(localDate);
		System.out.println(difference);

		difference=pastMonth.until(localDate);
		System.out.println(difference);
		
	}

}
