package com.exceptions.multiplecatchblock;

import java.util.Scanner;
public class MultipleCatchExample{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			int[] arr = {34, 23, 53};
			System.out.print("Enter Index: ");
			int index = input.nextInt();
			
			System.out.println("Value at index " + index + ": " + arr[index]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		input.close();
	}
}