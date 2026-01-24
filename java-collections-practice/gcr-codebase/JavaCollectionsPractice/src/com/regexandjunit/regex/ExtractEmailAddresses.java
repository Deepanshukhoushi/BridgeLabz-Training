package com.regexandjunit.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddresses {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
		
		Pattern pattern = Pattern.compile(regex);
		
		System.out.println("Enter full text with email: ");
		String str = input.nextLine();
		
		Matcher matcher = pattern.matcher(str);
		
		input.close();
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
