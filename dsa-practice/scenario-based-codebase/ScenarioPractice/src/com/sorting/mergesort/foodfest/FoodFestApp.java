package com.sorting.mergesort.foodfest;
import java.util.Scanner;

public class FoodFestApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of stalls: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Stall[] stalls = new Stall[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter stall name: ");
            String name = sc.nextLine();

            System.out.print("Enter footfall: ");
            int footfall = sc.nextInt();
            sc.nextLine(); 

            stalls[i] = new Stall(name, footfall);
        }

        MergeSortUtil.mergeSort(stalls, 0, n - 1);

        System.out.println("\nSorted Stall Performance:");
        for (Stall stall : stalls) {
            System.out.println(stall);
        }
        sc.close();
    }
}
