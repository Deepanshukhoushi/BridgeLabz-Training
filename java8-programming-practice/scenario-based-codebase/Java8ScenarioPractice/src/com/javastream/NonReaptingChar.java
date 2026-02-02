package com.javastream;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonReaptingChar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.nextLine();

		List<Character> list = str.chars()
		        .mapToObj(c -> (char) c)
		        .collect(Collectors.groupingBy(
		                Function.identity(), Collectors.counting()))
		            .entrySet().stream()
		            .filter(e -> e.getValue() == 1)
		            .map(Map.Entry::getKey)
		            .toList();

		System.out.println(list);
		input.close();
	}
}
