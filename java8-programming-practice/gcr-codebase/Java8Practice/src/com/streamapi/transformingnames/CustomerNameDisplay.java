package com.streamapi.transformingnames;

import java.util.*;

public class CustomerNameDisplay {
    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList(
            "rahul",
            "Anita",
            "suresh",
            "Meena",
            "kiran"
        );

        System.out.println("Customer Names (Uppercase & Sorted):");

        customerNames.stream()
                     .map(String::toUpperCase)

                     .sorted()

                     .forEach(System.out::println);
    }
}
