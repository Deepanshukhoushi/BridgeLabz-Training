package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountCSVRows {
    public static void main(String[] args) {
        String fileName = "students.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;

            br.readLine(); 

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("Number of records (excluding header): " + count);

        } catch (IOException e) {
            System.out.println("Error reading the CSV file.");
        }
    }
}
