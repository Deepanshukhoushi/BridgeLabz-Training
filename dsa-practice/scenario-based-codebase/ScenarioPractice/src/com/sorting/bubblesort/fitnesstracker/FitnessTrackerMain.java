package com.sorting.bubblesort.fitnesstracker;

import java.util.Scanner;

public class FitnessTrackerMain {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter number of user: ");
    	int size = input.nextInt();
    	User[] users = new User[size];
    	for(int i = 0; i<size; i++) {
    		System.out.println("Enter User name and no. of steps: ");
        	String name = input.next();
        	int steps = input.nextInt();
            users[i] = new User(name, steps);
    	}
    	

        FitnessTrackerBubbleSort.bubbleSort(users);

        System.out.println("Daily Step Rankings:");
        for (User u : users) {
            System.out.println(u.name + " - " + u.steps + " steps");
        }
        input.close();
    }
}

