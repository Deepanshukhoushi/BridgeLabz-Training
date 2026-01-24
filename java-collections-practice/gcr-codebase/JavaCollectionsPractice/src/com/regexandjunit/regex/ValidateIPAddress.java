package com.regexandjunit.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter IP address(_._._._): ");
        String ip = input.nextLine();

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)\\.){3}"
                     + "(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$";

        boolean isValid = Pattern.matches(regex, ip);

        if (isValid) {
            System.out.println("Valid IPv4 address");
        } else {
            System.out.println("Invalid IPv4 address");
        }

        input.close();
    }
}
