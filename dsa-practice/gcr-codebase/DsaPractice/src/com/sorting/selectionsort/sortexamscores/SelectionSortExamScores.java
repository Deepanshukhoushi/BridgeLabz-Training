package com.sorting.selectionsort.sortexamscores;

import java.util.Scanner;

public class SelectionSortExamScores {

    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[minIndex];
            scores[minIndex] = temp;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        int[] examScores = new int[n];

        System.out.println("Enter exam scores:");
        for (int i = 0; i < n; i++) {
            examScores[i] = input.nextInt();
        }

        selectionSort(examScores);

        System.out.println("Sorted Exam Scores :");
        for (int score : examScores) {
            System.out.print(score + " ");
        }
    }
}
