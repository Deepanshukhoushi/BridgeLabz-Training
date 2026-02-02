package com.javastream;

import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharsExceptSpaces {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		
		Map<Character, Long> result =
			    str.chars()
			        .filter(c -> c != ' ')
			        .mapToObj(c -> (char) c)
			        .collect(Collectors.groupingBy(
			            Function.identity(), Collectors.counting()));
		System.out.println(result);
		input.close();
	}
}
