package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter no. of elements");
		int num = input.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Enter number: ");
			list.add(input.nextInt());
		}
		
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println("Sum of numbers: " + sum);
	    input.close();
	}
}
