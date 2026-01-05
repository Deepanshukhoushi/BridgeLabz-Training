package com.hashmapsandhashfunctions.pairwithgivensum;

import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int target) {

        HashSet<Integer> visited = new HashSet<>();

        for (int value : arr) {
            int required = target - value;

            if (visited.contains(required)) {
                System.out.println("Pair found: " + value + " + " + required + " = " + target);
                return true;
            }

            visited.add(value);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = input.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = input.nextInt();

        boolean result = hasPairWithSum(arr, target);

        if (!result) {
            System.out.println("No pair exists with the given sum.");
        }

        input.close();
    }
}
