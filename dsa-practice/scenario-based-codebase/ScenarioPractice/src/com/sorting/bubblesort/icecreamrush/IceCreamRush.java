package com.sorting.bubblesort.icecreamrush;
import java.util.Scanner;

public class IceCreamRush {

    public static void bubbleSort(Flavor[] flavors) {
        int n = flavors.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (flavors[j].getSales() > flavors[j + 1].getSales()) {

                    Flavor temp = flavors[j];
                    flavors[j] = flavors[j + 1];
                    flavors[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of flavors: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Flavor[] flavors = new Flavor[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for flavor " + (i + 1));

            System.out.print("Flavor name: ");
            String name = scanner.nextLine();

            System.out.print("Sales count: ");
            int sales = scanner.nextInt();
            scanner.nextLine(); 

            flavors[i] = new Flavor(name, sales);
        }

        bubbleSort(flavors);

        System.out.println("\nFlavors sorted by popularity:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }

        scanner.close();
    }
}
