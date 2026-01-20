package com.interfaces.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class HospitalTriageSystem {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        Queue<Patient> triageQueue = new PriorityQueue<>(
                (p1, p2) -> p2.severity - p1.severity
        );
        System.out.println("Enter no. of Patients: ");
        int size = input.nextInt();
        
        for (int i = 0; i<size; i++) {
        	System.out.println("Enter Patient Name and severity: ");
        	String name = input.next();
        	int sev = input.nextInt();
        	
        	triageQueue.add(new Patient(name, sev));
        }

        System.out.println("Treatment Order:");

        while (!triageQueue.isEmpty()) {
            Patient p = triageQueue.poll();
            System.out.println(p.name + " (Severity: " + p.severity + ")");
        }
        input.close();
    }
}