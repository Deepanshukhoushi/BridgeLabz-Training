package com.travellog;

import java.io.*;
import java.util.*;

public class TripWriter {

    public static void main(String[] args) throws IOException {

        List<Trip> trips = Arrays.asList(
            new Trip("Paris", "France", 7, "Visited Eiffel Tower and cafes"),
            new Trip("Rome", "Italy", 4, "Colosseum and food tour"),
            new Trip("Paris", "France", 6, "Louvre and city walk"),
            new Trip("Berlin", "Germany", 8, "History and museums")
        );

        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("trips.dat"));

        oos.writeObject(trips);
        oos.close();

        System.out.println("Trips saved successfully.");
    }
}
