package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCSVBySalary {
    public static void main(String[] args) {
        String fileName = "employees.csv";
        List<String[]> records = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                records.add(line.split(","));
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
            return;
        }

        Collections.sort(records, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                double salary1 = Double.parseDouble(a[3]);
                double salary2 = Double.parseDouble(b[3]);
                return Double.compare(salary2, salary1); 
            }
        });

        System.out.println("Top 5 Highest-Paid Employees:");
        System.out.println("--------------------------------");

        for (int i = 0; i < Math.min(5, records.size()); i++) {
            String[] emp = records.get(i);
            System.out.println(
                "Name: " + emp[1] +
                ", Department: " + emp[2] +
                ", Salary: " + emp[3]
            );
        }
    }
}

