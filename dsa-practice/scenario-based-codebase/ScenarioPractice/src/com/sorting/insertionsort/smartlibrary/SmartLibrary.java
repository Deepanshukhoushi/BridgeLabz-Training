package com.sorting.insertionsort.smartlibrary;
import java.util.Scanner;

public class SmartLibrary {
    public static void insertionSort(Book[] books) {
        int n = books.length;

        for (int i = 1; i < n; i++) {
            Book key = books[i];
            int j = i - 1;

            while (j >= 0 &&
                   books[j].getTitle().compareToIgnoreCase(key.getTitle()) > 0) {
                books[j + 1] = books[j];
                j--;
            }

            books[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of borrowed books: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter book title " + (i + 1) + ": ");
            String title = scanner.nextLine();
            books[i] = new Book(title);
        }

        insertionSort(books);

        System.out.println("\nBorrowed books (Alphabetically Sorted):");
        for (Book book : books) {
            System.out.println(book);
        }

        scanner.close();
    }
}
