package com.hashmapsandhashfunctions.subarrayswithzerosum;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        // To handle subarrays starting from index 0
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        System.out.println("\nZero Sum Subarrays (start index → end index):");

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println((startIndex + 1) + " → " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
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

        findZeroSumSubarrays(arr);
        input.close();
    }
}
