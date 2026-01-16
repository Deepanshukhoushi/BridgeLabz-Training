package com.sorting.bubblesort.cinemahouse;
import java.util.Scanner;
class CinemaHouse {
    public static void bubbleSort(int[] showTimes) {
        int n = showTimes.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (showTimes[j] > showTimes[j + 1]) {
                    int temp = showTimes[j];
                    showTimes[j] = showTimes[j + 1];
                    showTimes[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of movie shows: ");
        int n = sc.nextInt();

        int[] showTimes = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter showtime " + (i + 1) + " (in minutes): ");
            showTimes[i] = sc.nextInt();
        }

        bubbleSort(showTimes);

        System.out.println("\nSorted Movie Showtimes:");
        for (int time : showTimes) {
            System.out.print(time + " ");
        }

        sc.close();
    }
}
