package com.linearandbinarysearch.linearsearch;
import java.util.Scanner;
public class FirstNegativeNumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter count of number: ");
		int count = input.nextInt();
		int[] arr = new int[count];
		
		for (int i = 0; i< count; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Index " + checkNegative(count, arr) + " is negative");
		input.close();
	}
		
	public static int checkNegative (int count, int[] arr) {
		for(int i = 0; i<count; i++) {
			if (arr[i] < 0) {
				return i;
			} 
		}
		return -1;
	}	
}
