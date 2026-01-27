package com.resumeanalyzer;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ResumeAnalyzer {
    private static final String EMAIL_REGEX =
            "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

    private static final String PHONE_REGEX =
            "\\b\\d{10}\\b";

    private static final String[] KEYWORDS =
            {"Java", "Python", "Spring"};

    public static void main(String[] args) {

        File folder = new File("resumes");
        Map<String, ResumeData> resumeMap = new HashMap<>();

        for (File file : folder.listFiles()) {
            try {
                if (!file.getName().endsWith(".txt")) {
                    throw new IllegalArgumentException("Invalid file format");
                }

                String content = readFile(file);

                String email = extractPattern(content, EMAIL_REGEX);
                String phone = extractPattern(content, PHONE_REGEX);

                int keywordCount = countKeywords(content);

                if (email == null) {
                    throw new Exception("Email not found");
                }

                ResumeData data =
                        new ResumeData(email, phone, keywordCount);

                resumeMap.put(email, data);

            } catch (Exception e) {
                System.out.println("Skipping file: "
                        + file.getName() + " → " + e.getMessage());
            }
        }

        // Convert Map to List and sort
        List<ResumeData> sortedList =
                new ArrayList<>(resumeMap.values());

        sortedList.sort((a, b) ->
                b.getKeywordCount() - a.getKeywordCount());

        System.out.println("\nSorted Candidates:");
        sortedList.forEach(System.out::println);
    }

    private static String readFile(File file) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            sb.append(line).append(" ");
        }
        br.close();
        return sb.toString();
    }

    private static String extractPattern(String text, String regex) {
        Matcher matcher = Pattern.compile(regex).matcher(text);
        return matcher.find() ? matcher.group() : null;
    }

    private static int countKeywords(String text) {
        int count = 0;
        for (String keyword : KEYWORDS) {
            Matcher matcher =
                    Pattern.compile(keyword, Pattern.CASE_INSENSITIVE)
                           .matcher(text);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}
