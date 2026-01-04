package com.stackandqueue.circulartourproblem;

import java.util.Scanner;

public class CircularTour {

    public static int findStartingPump(int[] petrol, int[] distance) {

        int balance = 0;
        int deficit = 0;
        int start = 0;

        for (int i = 0; i < petrol.length; i++) {
            balance += petrol[i] - distance[i];

            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of petrol pumps: ");
        int n = input.nextInt();

        int[] petrol = new int[n];
        int[] distance = new int[n];

        System.out.println("Enter petrol at each pump:");
        for (int i = 0; i < n; i++) {
            petrol[i] = input.nextInt();
        }

        System.out.println("Enter distance to next pump:");
        for (int i = 0; i < n; i++) {
            distance[i] = input.nextInt();
        }

        int startIndex = findStartingPump(petrol, distance);

        if (startIndex == -1) {
            System.out.println("No possible circular tour.");
        } else {
            System.out.println("Start at petrol pump index: " + startIndex);
        }

        input.close();
    }
}
