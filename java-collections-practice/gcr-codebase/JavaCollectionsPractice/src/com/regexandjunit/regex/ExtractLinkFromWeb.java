package com.regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinkFromWeb {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Text: ");
        String str = input.nextLine();

        String regex = "https?:\\/\\/[^\\s]+";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }

        input.close();
    }
}
