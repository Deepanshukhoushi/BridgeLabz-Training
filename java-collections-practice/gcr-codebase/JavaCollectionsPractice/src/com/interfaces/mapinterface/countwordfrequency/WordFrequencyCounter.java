package com.interfaces.mapinterface.countwordfrequency;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class WordFrequencyCounter {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        Map<String, Integer> frequencyMap = new HashMap<>();
        System.out.println("Enter File Path: ");
        String path = input.next();
        String filePath = path; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {

                line = line.toLowerCase().replaceAll("[^a-z ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        frequencyMap.put(
                            word,
                            frequencyMap.getOrDefault(word, 0) + 1
                        );
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("Word Frequency:");
        System.out.println(frequencyMap);
        input.close();
    }
}
