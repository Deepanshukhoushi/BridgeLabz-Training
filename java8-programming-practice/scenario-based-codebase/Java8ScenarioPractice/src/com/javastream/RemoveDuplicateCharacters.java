package com.javastream;

import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		
		String result = str.chars().distinct()
				.mapToObj(c -> String.valueOf((char) c))
				.collect(Collectors.joining());
		
		System.out.println(result);
		input.close();
	}
}
