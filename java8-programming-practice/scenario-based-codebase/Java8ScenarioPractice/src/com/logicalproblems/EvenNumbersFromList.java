package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EvenNumbersFromList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter no. of elements: ");
		int no = input.nextInt();
		for(int i = 0; i<no; i++) {
			list.add(input.nextInt());
		}
		
		List<Integer> even = list.stream().filter(n -> n%2 == 0).distinct().collect(Collectors.toList());
		
		System.out.println("Even List: " + even);
		
		input.close();
		 
	}
}
