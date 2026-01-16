package com.sorting.quicksort.cropmonitor;
import java.util.Scanner;
class CropMonitor {

	private static int partition(long[] time, double[] temp, int low, int high) {
        long pivot = time[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (time[j] <= pivot) {
                i++;
                swap(time, temp, i, j);
            }
        }
        swap(time, temp, i + 1, high);
        return i + 1;
    }

    private static void quickSort(long[] time, double[] temp, int low, int high) {
        if (low < high) {
            int pi = partition(time, temp, low, high);
            quickSort(time, temp, low, pi - 1);
            quickSort(time, temp, pi + 1, high);
        }
    }

    private static void swap(long[] time, double[] temp, int i, int j) {
        long t = time[i];
        time[i] = time[j];
        time[j] = t;

        double d = temp[i];
        temp[i] = temp[j];
        temp[j] = d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of sensor readings: ");
        int n = sc.nextInt();

        long[] timestamps = new long[n];
        double[] temperatures = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter timestamp for reading " + (i + 1) + ": ");
            timestamps[i] = sc.nextLong();

            System.out.print("Enter temperature: ");
            temperatures[i] = sc.nextDouble();
        }

        quickSort(timestamps, temperatures, 0, n - 1);

        System.out.println("\nSorted Sensor Data (by timestamp):");
        for (int i = 0; i < n; i++) {
            System.out.println(timestamps[i] + " → " + temperatures[i] + "°C");
        }

        sc.close();
    }
}
