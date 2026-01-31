package com.streamapi.filteringexpiring;

import java.time.LocalDate;
import java.util.*;

public class ExpiringMemberships {
    public static void main(String[] args) {

        List<Member> members = Arrays.asList(
            new Member("Rahul", LocalDate.now().plusDays(10)),
            new Member("Anita", LocalDate.now().plusDays(40)),
            new Member("Suresh", LocalDate.now().plusDays(25)),
            new Member("Meena", LocalDate.now().plusDays(5)),
            new Member("Kiran", LocalDate.now().plusDays(60))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        System.out.println("Members whose membership expires within next 30 days:");

        members.stream().filter(m -> !m.expiryDate.isBefore(today) && !m.expiryDate.isAfter(next30Days))
            .forEach(System.out::println);
    }
}
