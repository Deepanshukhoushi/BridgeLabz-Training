package com.regexandjunit.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		System.out.println("Enter Username: ");
		String input = sc.next();
		Matcher matcher = pattern.matcher(input);
		sc.close();
		while(matcher.find()) {
			System.out.println("Matched: " + matcher.group());
			return;
		}
		System.out.println("Not Matched!");
	}
}
