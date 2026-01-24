package com.regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter credit card number:");
        String cardNumber = input.nextLine();

        String regex = "^(4\\d{15}|5\\d{15})$";

        if (Pattern.matches(regex, cardNumber)) {
            if (cardNumber.startsWith("4")) {
                System.out.println("Valid Visa card");
            } else {
                System.out.println("Valid MasterCard");
            }
        } else {
            System.out.println("Invalid card number");
        }

        input.close();
    }
}
