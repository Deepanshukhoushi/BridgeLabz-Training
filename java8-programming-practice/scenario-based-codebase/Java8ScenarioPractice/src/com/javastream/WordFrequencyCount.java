package com.javastream;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordFrequencyCount {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = input.nextLine();
		
		Map<String, Long> result = Arrays.stream(str.split("\\s+")).
				collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		System.out.println(result);
		input.close();
	}
}
