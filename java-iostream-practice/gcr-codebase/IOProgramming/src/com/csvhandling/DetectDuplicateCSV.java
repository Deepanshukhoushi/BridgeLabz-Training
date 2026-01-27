package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {
    public static void main(String[] args) {
        String fileName = "students.csv";
       
        Set<String> seenIds = new HashSet<>();

        Set<String> duplicateIds = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); 
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String id = data[0];

                if (!seenIds.add(id)) {
                    duplicateIds.add(id);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            return;
        }

        if (duplicateIds.isEmpty()) {
            System.out.println("No duplicate records found.");
            return;
        }

        System.out.println("Duplicate Records:");
        System.out.println("----------------------------");

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (duplicateIds.contains(data[0])) {
                    System.out.println(line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
        }
    }
}
