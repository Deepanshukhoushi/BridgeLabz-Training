package com.interfaces.listinterface.reverselist;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class ReverseUsingArrayList {
	public static void reverseArraylist(List<Integer> list) {
		int left  = 0;
		int right = list.size() -1;
		
		while (left<right) {
			int temp = list.get(left);
			list.set(left,  list.get(right));
			list.set(right, temp);
			
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> arraylist = new ArrayList<>();
		
		System.out.println("Enter number of elements: ");
		int n = input.nextInt();
		
		System.out.println("Enter elements: ");
		for(int i = 0; i<n; i++) {
			arraylist.add(input.nextInt());
		}
		
		reverseArraylist(arraylist);
		System.out.println("Reversed List: " + arraylist);
		input.close();
		
	}
}
