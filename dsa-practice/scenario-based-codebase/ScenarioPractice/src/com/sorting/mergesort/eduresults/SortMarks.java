package com.sorting.mergesort.eduresults;

import java.util.Scanner;
import java.util.Arrays;

public class SortMarks {
    public static int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

        while (i < a.length)
            result[k++] = a[i++];

        while (j < b.length)
            result[k++] = b[j++];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students in District 1: ");
        int n1 = sc.nextInt();
        int[] district1 = new int[n1];

        System.out.println("Enter sorted scores of District 1:");
        for (int i = 0; i < n1; i++)
            district1[i] = sc.nextInt();

        System.out.print("\nEnter number of students in District 2: ");
        int n2 = sc.nextInt();
        int[] district2 = new int[n2];

        System.out.println("Enter sorted scores of District 2:");
        for (int i = 0; i < n2; i++)
            district2[i] = sc.nextInt();

        int[] finalRankList = merge(district1, district2);

        System.out.println("\nState-Level Rank List:");
        System.out.println(Arrays.toString(finalRankList));

        sc.close();
    }
}
