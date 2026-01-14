package com.parceltracker;
import java.util.Scanner;
public class ParcelTrackerApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        ParcelTracker tracker = new ParcelTracker();
        int choice;
        do {
		    System.out.println("\nChoose option ");
		    System.out.println("1. Packed");
		    System.out.println("2. Shipped");
		    System.out.println("3. In Transit");
		    System.out.println("4. Delivered");
		    choice = input.nextInt();
		    
		    switch (choice) {
		    case 1 -> {
		    	tracker.addStage("Packed");
		    	System.out.println("\nParcel Packed");
		    }
		    case 2 -> {tracker.addStage("Shipped");
		    	System.out.println("\nParcel Shipped");
		    }
		    case 3 -> {
		    	tracker.addStage("In Transit");
		    	System.out.println("\nParcel In Transit");
		    }
		    case 4 -> {
		    	tracker.addStage("Delivered");
		    	System.out.println("\nParcel Delivered");
		    }
		    default -> choice = -1;
		    }
        } while (choice != -1);
        
        System.out.println("Enter checkpoint where want to add Custom Checkpoint Name");
        String stage = input.nextLine();
        String check = input.nextLine();
        tracker.addCheckpoint(stage, check);

        tracker.trackParcel();
        tracker.checkLostParcel();
        input.close();
    }
}