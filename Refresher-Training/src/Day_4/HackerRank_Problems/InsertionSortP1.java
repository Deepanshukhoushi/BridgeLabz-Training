package Day_4.HackerRank_Problems;

import java.util.*;

public class InsertionSortP1 {

    public static void insertionSort1(int n, List<Integer> arr) {
        int val = arr.get(n - 1);
        int i = n - 2;

        // Shift elements greater than val to the right
        while (i >= 0 && arr.get(i) > val) {
            arr.set(i + 1, arr.get(i));
            printList(arr);
            i--;
        }

        // Place val in correct position
        arr.set(i + 1, val);
        printList(arr);
    }

    // Helper to print the list in one line
    static void printList(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        insertionSort1(n, arr);
        sc.close();
    }
}
