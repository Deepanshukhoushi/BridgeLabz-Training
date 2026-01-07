package com.linearandbinarysearch.binarysearch;

import java.util.Scanner;

public class FindPeakElement {
	public static int peakElement (int[] arr) {
		
		int n = arr.length;
		if (arr[0] > arr[1]) return 0;
		if (arr[n-1] > arr[n-2]) return n-1;
		int start = 0;
		int end = (arr.length)-1;
		int mid = (start+end)/2;
		while (start<end) {
			if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
			else if (arr[mid] < arr[mid-1]) end = mid-1;
			else start = mid+1;
		}
		return start;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter count of numbers: ");
		int size = input.nextInt();
		input.nextLine();
		System.out.println("Enter " + size + " numbers:");
		int[] arr = new int[size];
		for(int i = 0; i<size; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println(peakElement(arr));
		input.close();
	}
}
