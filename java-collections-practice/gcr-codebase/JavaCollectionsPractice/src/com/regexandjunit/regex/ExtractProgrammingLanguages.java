package com.regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();
        
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        input.close();
    }
}
