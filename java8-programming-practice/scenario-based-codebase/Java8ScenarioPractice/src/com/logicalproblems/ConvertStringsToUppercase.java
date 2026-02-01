package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConvertStringsToUppercase {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> list = new LinkedList<>();
		for(int i = 0; i<1; i++) {
			System.out.println("Enter Sentence: ");
			list.add(input.nextLine());
		}

		List<String> result = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		System.out.println("New String: " + result);
		
		input.close();
	}
}
