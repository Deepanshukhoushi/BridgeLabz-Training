package com.logicalproblems;

import java.util.Arrays;
import java.util.Scanner;

public class CountNoOfWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = input.nextLine();
		
		long count = Arrays.stream(str.split("\\s+")).count();
		System.out.println("No. of Words: "+ count);
		
		input.close();
	}
}
