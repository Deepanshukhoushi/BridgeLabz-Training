package com.interfaces.listinterface.reverselist;

import java.util.LinkedList;
import java.util.Scanner;
public class ReverseUsingLinkedList {
	public static void reverseLinkedList(LinkedList<Integer> list) {
		int left = 0;
		int right = list.size() -1;
		
		while (left < right) {
			Integer temp = list.get(left);
			list.set(left, list.get(right));
			list.set(right, temp);
			
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		
		System.out.println("Enter elements: ");
		for (int i = 0; i<n; i++) {
			list.add(input.nextInt());
		}
		
		reverseLinkedList(list);
		
		System.out.println("Reversed LinkedList: "+ list);
		input.close();
	}
}
