package com.interfaces.queueinterface.stackusingqueues;
import java.util.Scanner;
public class StackUsingQueuesMain {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        StackUsingQueues stack = new StackUsingQueues();
        
        System.out.println("Enter no. of elements: ");
        int size = input.nextInt();
        for (int i = 0; i<size; i++) {
        	System.out.println("Enter element: ");
        	int num = input.nextInt();
        	stack.push(num);
        }

        System.out.println("Poped: " + stack.pop()); 
        System.out.println("Top after popping: " + stack.top()); 
        input.close();
    }
}