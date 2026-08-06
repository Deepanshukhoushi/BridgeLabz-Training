package Day_5.HackerRank_Problems;

import java.util.*;

public class QuickSort {

    static void quickSort(int[] ar) {
        if (ar.length <= 1) return; // base case

        int pivot = ar[0];
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        // Partition step
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < pivot) {
                left.add(ar[i]);
            } else {
                right.add(ar[i]);
            }
        }

        // Convert lists to arrays manually
        int[] leftArr = new int[left.size()];
        for (int i = 0; i < left.size(); i++) leftArr[i] = left.get(i);

        int[] rightArr = new int[right.size()];
        for (int i = 0; i < right.size(); i++) rightArr[i] = right.get(i);

        // Recursively sort left and right
        quickSort(leftArr);
        quickSort(rightArr);

        // Merge results back into ar
        int idx = 0;
        for (int val : leftArr) ar[idx++] = val;
        ar[idx++] = pivot;
        for (int val : rightArr) ar[idx++] = val;

        // Print current state
        if (ar.length > 1) {
            printArray(ar);
        }
    }

    static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = in.nextInt();
        }
        quickSort(ar);
    }
}
