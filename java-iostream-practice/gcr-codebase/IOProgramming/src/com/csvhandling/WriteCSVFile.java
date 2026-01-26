package com.csvhandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSVFile {
	public static void main(String[] args) {
		String fileName = "employees.csv";
		
		try(FileWriter writer = new FileWriter(fileName)){
			writer.append("101,Deepanshu,IT,50000\n");
            writer.append("102,Rahul,HR,42000\n");
            writer.append("103,Priya,Finance,55000\n");
            writer.append("104,Amit,Marketing,48000\n");
            writer.append("105,Neha,Operations,46000\n");
			
			System.out.println("CSV file created and data written");
		} catch (IOException e) {
			System.out.println("Error writing to the CSV file.");
			
		}
	}
}
