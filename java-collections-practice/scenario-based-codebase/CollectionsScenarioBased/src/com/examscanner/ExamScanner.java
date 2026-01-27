package com.examscanner;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamScanner {

    // Only A, B, C, D allowed
    private static final String ANSWER_REGEX =
            "^[A-D](,[A-D])*$";

    public static void main(String[] args) {

        String answerKey =
                "A,B,C,D,A,B,C";

        List<String> correctAnswers =
                Arrays.asList(answerKey.split(","));

        Map<String, Integer> scoreMap = new HashMap<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader("answers.csv"))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    processLine(line, correctAnswers, scoreMap);
                } catch (Exception e) {
                    System.out.println("Invalid line skipped: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File read error");
        }

        // Sort using PriorityQueue
        PriorityQueue<Map.Entry<String, Integer>> ranking =
                new PriorityQueue<>(
                        (a, b) -> b.getValue() - a.getValue()
                );

        ranking.addAll(scoreMap.entrySet());

        System.out.println("\nStudent Rankings:");
        while (!ranking.isEmpty()) {
            Map.Entry<String, Integer> entry = ranking.poll();
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    private static void processLine(
            String line,
            List<String> correctAnswers,
            Map<String, Integer> scoreMap) {

        String[] parts = line.split(",", 2);

        if (parts.length != 2) {
            throw new IllegalArgumentException("Invalid CSV format");
        }

        String studentName = parts[0].trim();
        String answersPart = parts[1].trim();

        if (!Pattern.matches(ANSWER_REGEX, answersPart)) {
            throw new IllegalArgumentException("Invalid answers");
        }

        List<String> studentAnswers =
                Arrays.asList(answersPart.split(","));

        if (studentAnswers.size() != correctAnswers.size()) {
            throw new IllegalArgumentException("Answer count mismatch");
        }

        AnswerSheet<String> sheet =
                new MathAnswerSheet(studentAnswers);

        int score = calculateScore(sheet, correctAnswers);
        scoreMap.put(studentName, score);
    }

    private static int calculateScore(
            AnswerSheet<String> sheet,
            List<String> key) {

        int score = 0;
        for (int i = 0; i < key.size(); i++) {
            if (sheet.getAnswers().get(i).equals(key.get(i))) {
                score++;
            }
        }
        return score;
    }
}
