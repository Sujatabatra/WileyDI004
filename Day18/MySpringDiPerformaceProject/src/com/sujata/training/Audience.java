package com.sujata.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sujata.demo.Auditorium;

public class Audience {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("performances.xml");
		
		Auditorium audi=(Auditorium)applicationContext.getBean("LondonAudi");
		audi.act();

	}

}
