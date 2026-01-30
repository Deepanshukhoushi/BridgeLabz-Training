package com.functionalinterface.stringlengthchecker;

import java.util.Scanner;
import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your message: ");
        String message = sc.nextLine();

        System.out.print("Enter maximum allowed characters: ");
        int limit = sc.nextInt();

        Function<String, Integer> lengthFunction = msg -> msg.length();

        int messageLength = lengthFunction.apply(message);

        if (messageLength > limit) {
            System.out.println("Message exceeds character limit!");
            System.out.println("Length: " + messageLength + " | Limit: " + limit);
        } else {
            System.out.println("Message length is within limit.");
            System.out.println("Length: " + messageLength);
        }

        sc.close();
    }
}
