package com.sorting.insertionsort.sortemployeeids;
import java.util.Scanner;
public class EmployeeIds {
	public static int[] takeInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter no. of Employees: ");
		int size = input.nextInt();
		int[] empIds = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter No. "+ (i+1) + " Employee ID");
			empIds[i] = input.nextInt();
		}
		input.close();
		return empIds;
	}
}
