package com.rupak.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

	public static void main(String[] args) {
		
		
		
		//writing to a file
//		try {
//			BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\File-DB\\output.txt"));
//			writer.write("This is line one");
//			writer.write("\nThis is line two");
//			writer.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//reading a text file
		/*
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\File-DB\\output.txt"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		
		//reading excel file
		try {
			BufferedReader reader = new BufferedReader(new FileReader("D:\\File-DB\\company_with_isin_missing.xlsx"));
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
