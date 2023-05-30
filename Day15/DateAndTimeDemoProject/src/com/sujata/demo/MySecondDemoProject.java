package com.sujata.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class MySecondDemoProject {

	public static void main(String[] args) {
		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);

		String formatted=localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
		System.out.println(formatted);
		
		Date legacyDate=new Date();
		
		System.out.println(legacyDate);
		
		GregorianCalendar legacyCalender=new GregorianCalendar();
		System.out.println(legacyCalender);
		//Converting GregorianCalnder date to LocalDate
		ZonedDateTime zonedDateTime=legacyCalender.toZonedDateTime();
		LocalDate localDate=zonedDateTime.toLocalDate();
		System.out.println(localDate);
	}

}
