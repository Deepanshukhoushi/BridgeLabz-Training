package com.csvhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ValidateCSVData {
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private static final Pattern PHONE_PATTERN =
            Pattern.compile("^\\d{10}$");

    public static void main(String[] args) {

        String fileName = "users.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            String line;
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String email = data[2];
                String phone = data[3];

                boolean valid = true;
                StringBuilder errorMessage = new StringBuilder();

                if (!EMAIL_PATTERN.matcher(email).matches()) {
                    valid = false;
                    errorMessage.append("Invalid Email ");
                }

                if (!PHONE_PATTERN.matcher(phone).matches()) {
                    valid = false;
                    errorMessage.append("Invalid Phone Number ");
                }

                if (!valid) {
                    System.out.println("Invalid Row → " + line);
                    System.out.println("Error: " + errorMessage.toString());
                    System.out.println("--------------------------------");
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading CSV file.");
        }
    }
}
