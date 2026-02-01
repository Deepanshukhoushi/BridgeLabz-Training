package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MaxNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter no. of elements");
		int num = input.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Enter number: ");
			list.add(input.nextInt());
		}
		
		int maxim = list.stream().max(Integer::compare).get();
		
		System.out.println("Maximum of these: " + maxim);
		input.close();
	}
}
