package com.interfaces.queueinterface.circularbuffersimulation;
import java.util.Scanner;
public class CircularBufferMain {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter no. of elements: ");
    	int size = input.nextInt();
    	
        CircularBuffer cb = new CircularBuffer(size);
        for(int i = 0; i<size; i++) {
        	System.out.println("Enter element: ");
        	int num = input.nextInt();
        	cb.insert(num);
        }
        
        cb.display();
        input.close();
    }
}
