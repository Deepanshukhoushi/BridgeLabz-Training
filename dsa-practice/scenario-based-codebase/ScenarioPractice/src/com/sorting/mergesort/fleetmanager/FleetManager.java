package com.sorting.mergesort.fleetmanager;
public class FleetManager {

    public static void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid + 1, right);

            merge(vehicles, left, mid, right);
        }
    }

    private static void merge(Vehicle[] vehicles, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        Vehicle[] leftArray = new Vehicle[n1];
        Vehicle[] rightArray = new Vehicle[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = vehicles[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = vehicles[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i].getMileage() <= rightArray[j].getMileage()) {
                vehicles[k++] = leftArray[i++];
            } else {
                vehicles[k++] = rightArray[j++];
            }
        }

        while (i < n1) {
            vehicles[k++] = leftArray[i++];
        }

        while (j < n2) {
            vehicles[k++] = rightArray[j++];
        }
    }
}

