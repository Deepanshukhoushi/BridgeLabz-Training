package com.hashmapsandhashfunctions.twosumproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int required = target - arr[i];

            if (map.containsKey(required)) {
                return new int[] { map.get(required), i };
            }

            map.put(arr[i], i);
        }

        return new int[] { -1, -1 }; 
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

        int[] result = twoSum(arr, target);

        if (result[0] == -1) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        }

        input.close();
    }
}
