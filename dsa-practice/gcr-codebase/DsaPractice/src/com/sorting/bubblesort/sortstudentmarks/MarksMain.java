package com.sorting.bubblesort.sortstudentmarks;
import java.util.Scanner;
public class MarksMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the count of Students: ");
		int size = input.nextInt();
		int[] marks = new int[size];
		for (int i = 0; i<size; i++) {
			System.out.println("Enter student "+ (i+1) + " marks: ");
			marks[i] = input.nextInt();
		}
		sortMarks(size, marks);
		input.close();
	}
	public static void sortMarks(int size, int[] marks) {
		for (int i =0; i < size-1; i++) {
			for (int j = 0; j<size-i-1; j++) {
				if (marks[j] > marks[j+1]) {
					int temp = marks[j]; 
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
		System.out.println("Marks from highest to lowest are: ");
		for (int i = 0; i<size; i++) {
			System.out.println(marks[i]);
		}
	}
}
