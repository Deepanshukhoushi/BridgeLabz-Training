package com.feedbackguru;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FeedbackGuru {

    private static final String RATING_REGEX = "(\\d{1,2})/10";

    public static void main(String[] args) {

        File folder = new File("feedbacks");

        Map<String, List<String>> feedbackMap = new HashMap<>();
        feedbackMap.put("Positive", new ArrayList<>());
        feedbackMap.put("Neutral", new ArrayList<>());
        feedbackMap.put("Negative", new ArrayList<>());

        for (File file : folder.listFiles()) {
            if (!file.getName().endsWith(".txt")) continue;

            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line;
                while ((line = br.readLine()) != null) {
                    try {
                        processLine(line, feedbackMap);
                    } catch (Exception e) {
                        System.out.println("Skipping invalid feedback: " + line);
                    }
                }

            } catch (IOException e) {
                System.out.println("Error reading file: " + file.getName());
            }
        }

        displaySummary(feedbackMap);
    }

    private static void processLine(String line,
                                    Map<String, List<String>> map) {

        Matcher matcher = Pattern.compile(RATING_REGEX).matcher(line);

        if (!matcher.find()) {
            throw new IllegalArgumentException("Rating not found");
        }

        int rating = Integer.parseInt(matcher.group(1));

        if (rating >= 8) {
            map.get("Positive").add(line);
        } else if (rating >= 5) {
            map.get("Neutral").add(line);
        } else {
            map.get("Negative").add(line);
        }
    }

    private static void displaySummary(Map<String, List<String>> map) {

        System.out.println("\nFeedback Summary");

        map.forEach((category, feedbacks) -> {
            System.out.println("\n" + category + " Feedbacks:");
            feedbacks.forEach(f -> System.out.println("• " + f));
        });
    }
}
