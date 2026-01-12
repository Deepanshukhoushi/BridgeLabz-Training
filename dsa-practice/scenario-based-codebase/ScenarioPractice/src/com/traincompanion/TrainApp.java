package com.traincompanion;
import java.util.Scanner;
public class TrainApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
        TrainCompanion train = new TrainCompanion();
        System.out.println("Enter number of compartments: ");
        int num = input.nextInt();
        System.out.println("Enter compartments: ");
        for(int i = 0; i<num; i++) {
        	train.addCompartment(input.next());
        }
        
        train.traverseForward();
        train.traverseBackward();
        System.out.println("\nEnter Compartment to found: ");
        String found = input.next();
        do {
        	train.showAdjacent(found);
        	System.out.println("\nEnter Compartment name to find OR Enter (exit): ");
            found = input.next();
        } while (!found.equals("exit"));
        
        
        
        System.out.println("\nEnter Compartment to remove: ");
        train.removeCompartment(input.next());
        train.traverseForward();
        input.close();
    }
}
