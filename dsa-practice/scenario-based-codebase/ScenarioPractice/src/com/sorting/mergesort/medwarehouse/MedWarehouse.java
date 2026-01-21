package com.sorting.mergesort.medwarehouse;
import java.util.Scanner;

public class MedWarehouse {
    public static void mergeSort(Medicine[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    private static void merge(Medicine[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        Medicine[] L = new Medicine[n1];
        Medicine[] R = new Medicine[n2];

        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i].expiryDays <= R[j].expiryDays)
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }

        while (i < n1)
            arr[k++] = L[i++];

        while (j < n2)
            arr[k++] = R[j++];
    }

    public static void checkNearExpiry(Medicine[] medicines) {
        System.out.println("\nNear Expiry Medicines:");
        boolean found = false;

        for (Medicine m : medicines) {
            if (m.expiryDays <= 30) {
                System.out.println(m.name + " → " + m.expiryDays + " days left");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No medicines nearing expiry.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of medicines: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        Medicine[] medicines = new Medicine[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Medicine " + (i + 1));
            System.out.print("Medicine Name: ");
            String name = sc.nextLine();

            System.out.print("Days to Expire: ");
            int days = sc.nextInt();
            sc.nextLine(); 

            medicines[i] = new Medicine(name, days);
        }

        mergeSort(medicines, 0, n - 1);

        System.out.println("\nMedicines Sorted by Expiry:");
        for (Medicine m : medicines) {
            System.out.println(m.name + " → " + m.expiryDays + " days");
        }

        checkNearExpiry(medicines);
        sc.close();
    }
}

