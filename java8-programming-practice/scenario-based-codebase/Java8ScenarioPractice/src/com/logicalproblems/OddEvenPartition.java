package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OddEvenPartition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter no. of elements");
		int num = input.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Enter number: ");
			list.add(input.nextInt());
		}
		
		Map<Boolean, List<Integer>> map = list.stream()
		        .collect(Collectors.partitioningBy(n -> n % 2 == 0));
		
		System.out.println("Is Even: " + map);
		input.close();
	}
}
