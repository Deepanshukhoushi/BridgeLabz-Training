package com.logicalproblems;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SecondHighestNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Integer> list = new LinkedList<>();
		System.out.println("Enter no. of elements");
		int num = input.nextInt();
		for(int i = 0; i<num; i++) {
			System.out.println("Enter number: ");
			list.add(input.nextInt());
		}
		
		int secondHighest = list.stream().sorted().skip(1).findFirst().get();
		
		System.out.print("Second highest element: " + secondHighest);
		
		input.close();
	}
}
