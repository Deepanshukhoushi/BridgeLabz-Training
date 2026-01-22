package com.javastreams.filterstreams;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UpperToLowerCaseFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Enter destination file path: ");
        String destinationPath = scanner.nextLine();

        try (
            BufferedReader reader = new BufferedReader(
                    new FileReader(sourcePath, StandardCharsets.UTF_8));

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(destinationPath, StandardCharsets.UTF_8))
        ) {

            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(Character.toLowerCase((char) ch));
            }

            System.out.println("\nFile content converted to lowercase successfully.");

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        scanner.close();
    }
}
