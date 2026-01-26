package com.csvhandling;
import java.io.*;

public class ReadCSVFile {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Student.csv"))) {
            String line;
            br.readLine(); 

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",");

                if (columns.length >= 2) {
                    System.out.println(
                        "ID: " + columns[0] +
                        ", Name: " + columns[1]
                    );
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}

