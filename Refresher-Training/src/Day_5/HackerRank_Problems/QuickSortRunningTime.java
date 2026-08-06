package Day_5.HackerRank_Problems;

import java.util.*;

public class QuickSortRunningTime {

    static int insertionShifts = 0;
    static int quickSwaps = 0;

    // Insertion Sort with shift count
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                insertionShifts++; // count each shift
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Quicksort with swap count (Lomuto partition)
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);
        return i;
    }

    static void swap(int[] arr, int i, int j) {
        // Count ALL swaps, even self-swaps
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        quickSwaps++;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
            arr2[i] = arr1[i];
        }

        insertionSort(arr1);
        quickSort(arr2, 0, n - 1);

        System.out.println(insertionShifts - quickSwaps);
    }
}
