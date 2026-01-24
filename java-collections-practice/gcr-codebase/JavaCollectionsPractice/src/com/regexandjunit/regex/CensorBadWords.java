package com.regexandjunit.regex;

import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter sentence:");
        String text = input.nextLine();

        String[] badWords = { "damn", "stupid" };

        for (String word : badWords) {
            text = text.replaceAll("(?i)\\b" + word + "\\b", "****");
        }

        System.out.println("Output:");
        System.out.println(text);

        input.close();
    }
}
