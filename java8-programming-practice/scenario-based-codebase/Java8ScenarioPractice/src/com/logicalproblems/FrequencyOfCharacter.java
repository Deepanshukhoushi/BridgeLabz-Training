package com.logicalproblems;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		String str = input.nextLine();
		
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		System.out.println(map);
		input.close();
	}
}
