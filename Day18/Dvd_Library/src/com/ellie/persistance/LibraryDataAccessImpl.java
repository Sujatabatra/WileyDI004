package com.ellie.persistance;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

import com.ellie.dto.Single_DVD;

public class LibraryDataAccessImpl implements LibraryDataAccess {

	//No Dependency(no private property)
	@Override
	public boolean writeRecords(LinkedList<Single_DVD> dvds) throws Exception {
		FileWriter fileWriter=new FileWriter("DVD_Data");
		PrintWriter printWriter=new PrintWriter(fileWriter);
		
		for(Single_DVD dvd:dvds) {
			String dvdStr=dvd.getTitle()+","+dvd.getReleaseDate()+","+dvd.getRating()+","+dvd.getDirectorName()+","+dvd.getStudio()+","+dvd.getUserNotes();
			printWriter.println(dvdStr);
		}
		printWriter.flush();
		printWriter.close();
		fileWriter.close();
		return true;
	}


	public static LinkedList<Single_DVD> readRecords() throws Exception {
		LinkedList<Single_DVD> dvds=new LinkedList<Single_DVD>();
		FileReader fileReader = new FileReader("DVD_Data");
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		Scanner scanner=new Scanner(bufferedReader);
		while(scanner.hasNext()) {
			String currentLine= scanner.nextLine();
			String values[]=currentLine.split(",");
			Single_DVD dvd=new Single_DVD(values[0], values[1], Integer.parseInt(values[2]), values[3], values[4], values[5]);
			dvds.add(dvd);
		}
		fileReader.close();
		bufferedReader.close();
		return dvds;
	}

}
