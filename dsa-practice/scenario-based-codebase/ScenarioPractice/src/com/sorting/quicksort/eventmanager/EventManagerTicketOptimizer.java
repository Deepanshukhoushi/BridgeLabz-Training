package com.sorting.quicksort.eventmanager;
import java.util.Scanner;
import java.util.Arrays;

public class EventManagerTicketOptimizer {

    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];  
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of ticket prices: ");
        int n = sc.nextInt();

        int[] prices = new int[n];

        System.out.println("Enter ticket prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(prices));

        quickSort(prices, 0, n - 1);

        System.out.println("\nAfter Sorting (Quick Sort):");
        System.out.println(Arrays.toString(prices));

        sc.close();
    }
}
