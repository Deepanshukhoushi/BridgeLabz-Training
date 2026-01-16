package com.sorting.insertionsort.robowarehouse;

import java.util.ArrayList;
import java.util.Scanner;
class RoboWarehouse {

    private static void insertSorted(ArrayList<Integer> shelf, int weight) {
        int i = shelf.size() - 1;

        while (i >= 0 && shelf.get(i) > weight) {
            i--;
        }

        shelf.add(i + 1, weight); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> shelf = new ArrayList<>();

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter weight of package " + i + ": ");
            int weight = sc.nextInt();

            insertSorted(shelf, weight);

            System.out.println("Shelf status: " + shelf);
        }

        sc.close();
    }
}
