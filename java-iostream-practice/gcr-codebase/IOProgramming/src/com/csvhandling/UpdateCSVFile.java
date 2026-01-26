package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateCSVFile {
    public static void main(String[] args) {
        String inputFile = "employees.csv";
        String outputFile = "updated_employees.csv";

        try (
            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            FileWriter writer = new FileWriter(outputFile)
        ) {

            String line;

            writer.write(br.readLine() + "\n");

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                if (department.equalsIgnoreCase("IT")) {
                    salary = salary + (salary * 0.10);
                }

                writer.write(
                    data[0] + "," +
                    data[1] + "," +
                    data[2] + "," +
                    (int) salary + "\n"
                );
            }

            System.out.println("Updated CSV file created successfully.");

        } catch (IOException e) {
            System.out.println("Error processing the CSV file.");
        }
    }
}