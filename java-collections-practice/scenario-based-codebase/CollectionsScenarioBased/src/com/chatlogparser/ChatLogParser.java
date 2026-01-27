package com.chatlogparser;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParser {

    // [12:02 PM] John: Message
    private static final String CHAT_REGEX =
            "\\[(.*?)\\]\\s(.*?):\\s(.*)";

    public static void main(String[] args) {

        Map<String, List<String>> userMessages =
                new TreeMap<>(); // auto-sorted

        MessageFilter<String> filter =
                new IdleChatFilter();

        try (BufferedReader br =
                     new BufferedReader(new FileReader("chatlog.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {

                try {
                    parseLine(line, userMessages, filter);
                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading chat log");
        }

        displaySummary(userMessages);
    }

    private static void parseLine(
            String line,
            Map<String, List<String>> map,
            MessageFilter<String> filter) {

        Matcher matcher =
                Pattern.compile(CHAT_REGEX).matcher(line);

        if (!matcher.matches()) {
            throw new IllegalArgumentException("Invalid format");
        }

        String timestamp = matcher.group(1);
        String user = matcher.group(2);
        String message = matcher.group(3);

        if (!filter.allow(message)) {
            return; // idle chat ignored
        }

        map.computeIfAbsent(user, k -> new ArrayList<>())
           .add("[" + timestamp + "] " + message);
    }

    private static void displaySummary(
            Map<String, List<String>> map) {

        System.out.println("\nProductivity Messages");

        map.forEach((user, messages) -> {
            System.out.println("\n " + user);
            messages.forEach(msg ->
                    System.out.println("  • " + msg));
        });
    }
}
