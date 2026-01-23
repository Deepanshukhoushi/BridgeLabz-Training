package com.javastreams.wordfrequencycounter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = scanner.nextLine();

        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            while ((line = reader.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-z0-9 ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word,
                                wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            scanner.close();
            return;
        }

        List<Map.Entry<String, Integer>> wordList =
                new ArrayList<>(wordCountMap.entrySet());

        wordList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("\nTop 5 most frequent words:");
        for (int i = 0; i < Math.min(5, wordList.size()); i++) {
            Map.Entry<String, Integer> entry = wordList.get(i);
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        scanner.close();
    }
}
