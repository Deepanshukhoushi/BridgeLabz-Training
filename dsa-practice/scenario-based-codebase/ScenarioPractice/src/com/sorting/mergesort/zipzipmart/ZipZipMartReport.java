package com.sorting.mergesort.zipzipmart;
import java.util.Scanner;
import java.util.Arrays;

public class ZipZipMartReport {

    public static void mergeSort(int[] sales, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(sales, left, mid);
            mergeSort(sales, mid + 1, right);

            merge(sales, left, mid, right);
        }
    }

    private static void merge(int[] sales, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = sales[left + i];

        for (int j = 0; j < n2; j++)
            rightArray[j] = sales[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) { 
                sales[k++] = leftArray[i++];
            } else {
                sales[k++] = rightArray[j++];
            }
        }

        while (i < n1)
            sales[k++] = leftArray[i++];

        while (j < n2)
            sales[k++] = rightArray[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of daily sales records: ");
        int n = sc.nextInt();

        int[] sales = new int[n];

        System.out.println("Enter sales amounts:");
        for (int i = 0; i < n; i++) {
            sales[i] = sc.nextInt();
        }

        System.out.println("\nBefore Sorting:");
        System.out.println(Arrays.toString(sales));

        mergeSort(sales, 0, n - 1);

        System.out.println("\nAfter Sorting (Merge Sort):");
        System.out.println(Arrays.toString(sales));

        sc.close();
    }
}
