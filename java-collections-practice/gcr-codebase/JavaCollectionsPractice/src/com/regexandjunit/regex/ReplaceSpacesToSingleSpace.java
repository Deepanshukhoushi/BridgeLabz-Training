package com.regexandjunit.regex;

import java.util.Scanner;

public class ReplaceSpacesToSingleSpace {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter text:");
        String text = input.nextLine();

        String result = text.replaceAll("\\s+", " ");

        System.out.println("Output:");
        System.out.println(result);

        input.close();
    }
}
