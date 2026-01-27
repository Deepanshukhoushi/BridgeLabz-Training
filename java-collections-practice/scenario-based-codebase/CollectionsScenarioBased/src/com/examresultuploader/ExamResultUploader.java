package com.examresultuploader;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ExamResultUploader {

    // RollNo,Name,Subject,Marks
    private static final String CSV_REGEX =
            "\\d+,[A-Za-z ]+,[A-Za-z ]+,\\d{1,3}";

    public static void main(String[] args) {

        Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

        try (BufferedReader br =
                     new BufferedReader(new FileReader("marks.csv"))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {
                try {
                    processLine(line, subjectMarksMap);
                } catch (Exception e) {
                    System.out.println("Skipping record: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("File reading error");
        }

        displayTopScorers(subjectMarksMap);
    }

    private static void processLine(
            String line,
            Map<String, List<Integer>> map)
            throws InvalidRecordException, MissingMarksException {

        if (!Pattern.matches(CSV_REGEX, line)) {
            throw new InvalidRecordException("Invalid format → " + line);
        }

        String[] parts = line.split(",");

        String rollNo = parts[0];
        String name = parts[1];
        String subject = parts[2];
        String marksStr = parts[3];

        if (marksStr.isEmpty()) {
            throw new MissingMarksException("Marks missing for " + name);
        }

        int marks = Integer.parseInt(marksStr);

        ExamRecord<Integer> record =
                new ExamRecord<>(rollNo, name, subject, marks);

        map.computeIfAbsent(record.getSubject(),
                k -> new ArrayList<>()).add(record.getMarks());
    }

    private static void displayTopScorers(
            Map<String, List<Integer>> map) {

        System.out.println("\nTop Scorers Per Subject");

        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {

            PriorityQueue<Integer> pq =
                    new PriorityQueue<>(Comparator.reverseOrder());

            pq.addAll(entry.getValue());

            System.out.println(entry.getKey() +
                    " → Highest Marks: " + pq.peek());
        }
    }
}
