package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveEmptyStrings {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<String> list = new LinkedList<>();
		
		list.add(input.nextLine());
		
		List<String> removed = list.stream().filter(e -> !e.isEmpty()).collect(Collectors.toList());
		
		System.out.println("After removing empty: " + removed);
		input.close();
	}
}
