package com.sorting.insertionsort.smartshelf;
import java.util.*;
import java.util.Scanner;
public class SmartShelfApp {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		LinkedList <String> list = new LinkedList<>();
		String choice;
		do {
			System.out.println("Enter book title: ");
			String title = input.next();
			list.add(title);
			InsertionSort.insertionSort(list);
			System.out.println("Enter 'yes' to add new book or 'no' to exit:");
			choice = input.next();
			System.out.println("");
		} while(choice.equals("yes"));
		System.out.print(list);
		input.close();
	}
}
/*
 * 2. SmartShelf – Real-Time Book Arrangement (Insertion Sort) Story: In a
 * digital library kiosk, as users add books to their reading list, the system
 * must keep the list sorted alphabetically by title. Since books are added one
 * at a time and the list is mostly sorted, Insertion Sort fits perfectly. Key
 * Concepts: ● Online/real-time sorting ● Efficient for nearly sorted data ●
 * Stable sorting by title
 */