package com.linearandbinarysearch.binarysearch;

import java.util.Scanner;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int row = mid / cols;
            int col = mid % cols;

            int midValue = matrix[row][col];

            if (midValue == target) {
                return true;
            } else if (target < midValue) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements (row-wise):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target value: ");
        int target = sc.nextInt();

        // Search result
        boolean result = searchMatrix(matrix, target);

        System.out.println("Target found: " + result);

        sc.close();
    }
}
