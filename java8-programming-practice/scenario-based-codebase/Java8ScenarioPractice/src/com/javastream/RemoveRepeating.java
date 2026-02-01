package com.javastream;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveRepeating {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		
		String result =
			    str.chars()
			        .mapToObj(c -> (char) c)
			        .collect(Collectors.groupingBy(
			            Function.identity(), Collectors.counting()))
			        .entrySet().stream()
			        .filter(e -> e.getValue() == 1)
			        .map(e -> String.valueOf(e.getKey()))
			        .collect(Collectors.joining());
		System.out.println(result);
		input.close();
	}
}
