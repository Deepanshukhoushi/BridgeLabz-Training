package com.regexandjunit.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateLicensePlateNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String regex = "^[A-Z]{2}\\d{4}$";
		Pattern pattern = Pattern.compile(regex);
		System.out.println("Enter License Number: ");
		String str = input.next();
		
		Matcher matcher = pattern.matcher(str);
		input.close();
		while(matcher.find()) {
			System.out.println("Matched: " + matcher.group());
			return;
		}
		System.out.println("Not Matched!");
	}
}
