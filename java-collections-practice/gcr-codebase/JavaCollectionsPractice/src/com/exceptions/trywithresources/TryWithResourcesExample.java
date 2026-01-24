package com.exceptions.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("info.txt"))) {

            String firstLine = bufferedReader.readLine();
            System.out.println(firstLine);

        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
