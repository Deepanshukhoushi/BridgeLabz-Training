package com.stringbuffer;
import java.util.Scanner;

public class ConcatenateStringsUsingStringBuffer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            words[i] = scanner.nextLine();
        }

        StringBuffer buffer = new StringBuffer();

        for (String word : words) {
            buffer.append(word);
        }

        System.out.println("Concatenated String: " + buffer.toString());

        scanner.close();
    }
}
