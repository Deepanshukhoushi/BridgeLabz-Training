package com.logicalproblems;

import java.util.Scanner;

public class CountVowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = input.nextLine();
		
		long count = str.chars().filter(c -> "aeiou".indexOf(c) != -1).count();
		
		System.out.println("No. of Vowels: " + count);
		input.close();
	}
}	
