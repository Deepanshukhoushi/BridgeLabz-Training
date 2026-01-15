package com.sorting.mergesort.examcell;
import java.util.Scanner;
import java.util.Arrays;

public class ExamCellStudentRank {

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

        System.out.print("Enter number of students in Center 1: ");
        int n1 = sc.nextInt();
        int[] center1 = new int[n1];

        System.out.println("Enter sorted scores of Center 1:");
        for (int i = 0; i < n1; i++)
            center1[i] = sc.nextInt();

        System.out.print("\nEnter number of students in Center 2: ");
        int n2 = sc.nextInt();
        int[] center2 = new int[n2];

        System.out.println("Enter sorted scores of Center 2:");
        for (int i = 0; i < n2; i++)
            center2[i] = sc.nextInt();

        int[] finalRankList = merge(center1, center2);

        System.out.println("\nState-Level Rank List:");
        System.out.println(Arrays.toString(finalRankList));

        sc.close();
    }
}
