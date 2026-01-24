package com.regexandjunit.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ValidateHexColorCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String regex = "^#[0-9A-Fa-f]{6}$";
		
		Pattern pattern = Pattern.compile(regex);
		
		System.out.println("Enter Hex Color Code: ");
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
