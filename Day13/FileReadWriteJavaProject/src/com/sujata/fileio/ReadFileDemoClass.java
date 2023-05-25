package com.sujata.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileDemoClass {

	public static void main(String[] args)throws Exception {
		//Open the file for reading
		FileReader fileReader=new FileReader("DemoFile");
		
		//read the content from buffer
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		
		Scanner scanner=new Scanner(bufferedReader);
		while(scanner.hasNext()) {
			String currentLine=scanner.nextLine();
			System.out.println(currentLine);
		}
		fileReader.close();
		bufferedReader.close();
		
	}

}
