package com.sorting.bubblesort.hospitalqueue;
import java.util.Scanner;
public class HospitalQueueApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of patients: ");
		int size = input.nextInt();
		Patient[] patients = new Patient[size];
		
		
		for (int i = 0; i<size; i++) {
			System.out.println("Enter patient " + (i+1) + " Name and PatientID: ");
			String name = input.next();
			int criticality = input.nextInt();
			
			patients[i] = new Patient(name, criticality);
		}
		
		HospitalQueue queue = new HospitalQueue();
		System.out.println("Before Sorting:");

		queue.displayPatients(patients);
		
		queue.sortByCriticality(patients);
		
		System.out.println("\nAfter Sorting by Criticality: ");
		queue.displayPatients(patients);
		input.close();
	}
}
