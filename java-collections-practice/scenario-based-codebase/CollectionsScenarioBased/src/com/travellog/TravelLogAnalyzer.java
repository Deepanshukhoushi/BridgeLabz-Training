package com.travellog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class TravelLogAnalyzer {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("trips.dat"));

        List<Trip> trips = (List<Trip>) ois.readObject();
        ois.close();

        Set<String> uniqueCountries = new HashSet<>();
        Map<String, Integer> cityCountMap = new HashMap<>();

        System.out.println("Trips longer than 5 days:");
        for (Trip trip : trips) {

            uniqueCountries.add(trip.getCountry());

            cityCountMap.put(
                trip.getCity(),
                cityCountMap.getOrDefault(trip.getCity(), 0) + 1
            );

            if (trip.getDurationDays() > 5) {
                System.out.println(trip);
            }

            Pattern pattern =
                    Pattern.compile(trip.getCity(), Pattern.CASE_INSENSITIVE);
            Matcher matcher =
                    pattern.matcher(trip.getDescription());

            if (matcher.find()) {
                System.out.println("City mentioned in description: "
                        + trip.getCity());
            }
        }

        System.out.println("\nUnique Countries Visited:");
        uniqueCountries.forEach(System.out::println);

        List<Map.Entry<String, Integer>> cityList =
                new ArrayList<>(cityCountMap.entrySet());

        cityList.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("\nTop 3 Most Visited Cities:");
        cityList.stream().limit(3)
                .forEach(e ->
                        System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
