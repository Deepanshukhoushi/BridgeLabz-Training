package com.foreachmethod;

import java.util.*;

public class EventWelcomeMessage {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Rahul",
            "Anita",
            "Suresh",
            "Meena"
        );

        System.out.println("Welcome Messages:");

        // 🔹 forEach() with lambda
        attendees.forEach(name ->
                System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
