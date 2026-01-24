package com.regexandjunit.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ExtractCapitalizedWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String regex = "\\b[A-Z][a-z]*\\b";
		
		Pattern pattern = Pattern.compile(regex);
		
		System.out.println("Enter Sentence: ");
		String str = input.nextLine();
		Matcher matcher = pattern.matcher(str); 
		input.close();
		
		while(matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
