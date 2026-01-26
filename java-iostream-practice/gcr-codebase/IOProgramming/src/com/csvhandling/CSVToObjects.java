package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVToObjects {
    public static void main(String[] args) {

        String fileName = "students.csv";
        List<Map<String, String>> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            String[] headers = br.readLine().split(","); 

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");

                Map<String, String> student = new HashMap<>();
                for (int i = 0; i < headers.length; i++) {
                    student.put(headers[i], values[i]);
                }

                students.add(student);
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
        }

        for (Map<String, String> s : students) {
            System.out.println(
                "Student [ID=" + s.get("ID") +
                ", Name=" + s.get("Name") +
                ", Age=" + s.get("Age") +
                ", Marks=" + s.get("Marks") + "]"
            );
        }
    }
}
