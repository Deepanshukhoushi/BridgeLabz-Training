package com.stringbuilder;
import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                result.append(ch);
                seen.add(ch);
            }
        }

        System.out.println("String without duplicates: " + result.toString());
        input.close();
    }
}
