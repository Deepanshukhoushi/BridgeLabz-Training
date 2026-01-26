package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SearchEmployeeCSV {
    public static void main(String[] args) {
        String fileName = "employees.csv";
        String searchName = "Deepanshu"; 
        boolean found = false;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String name = data[1];

                if (name.equalsIgnoreCase(searchName)) {
                    System.out.println("Employee Found!");
                    System.out.println("Name       : " + name);
                    System.out.println("Department : " + data[2]);
                    System.out.println("Salary     : " + data[3]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Employee not found.");
            }

        } catch (IOException e) {
            System.out.println("Error reading the CSV file.");
        }
    }
}
