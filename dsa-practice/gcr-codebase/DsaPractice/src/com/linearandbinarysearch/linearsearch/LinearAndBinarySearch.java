package com.linearandbinarysearch.linearsearch;
import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearch {

    // Linear Search: Find first missing positive integer
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        // Mark visited positive numbers
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    // Binary Search: Find index of target
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Find first missing positive
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive Integer: " + missing);

        // Input target for binary search
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target Index: " + index);

        sc.close();
    }
}
