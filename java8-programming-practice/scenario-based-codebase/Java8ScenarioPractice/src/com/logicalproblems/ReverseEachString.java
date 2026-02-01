package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseEachString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<String> list = new LinkedList<>();
		System.out.println("Enter Sentence: ");
		list.add(input.nextLine());
		
		List<String> result = list.stream().map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.toList());
		System.out.println(result);
		input.close();
	}
}
