package com.ellie.client;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ellie.ui.LibraryUserInterface;
import com.ellie.ui.LibraryUserInterfaceImpl;

public class LibraryClient {

	public static void main(String[] args) {
		
//		LibraryUserInterface libraryUserInterface=new LibraryUserInterfaceImpl();
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dvd.xml");
		
		LibraryUserInterface libraryUserInterface=(LibraryUserInterface)applicationContext.getBean("userInterface");
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			libraryUserInterface.showMenu();
			System.out.println("Please enter what action you would like to take :");
			int action=scanner.nextInt();
			libraryUserInterface.performMenu(action);
		}
		

	}

}
