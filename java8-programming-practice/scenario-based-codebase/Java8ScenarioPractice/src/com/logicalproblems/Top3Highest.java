package com.logicalproblems;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Top3Highest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter no. of elements");
		int num = input.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Enter number: ");
			list.add(input.nextInt());
		}
		
		List<Integer> result = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println("Top 3 Highest No. " + result);
		input.close();
	}
}
