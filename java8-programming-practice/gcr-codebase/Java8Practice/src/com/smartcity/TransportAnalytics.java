package com.smartcity;

import java.util.*;
import java.util.stream.Collectors;

class TransportAnalytics {

    static void generateReports(List<PassengerTrip> trips) {

        Map<String, List<PassengerTrip>> byRoute =
                trips.stream()
                     .collect(Collectors.groupingBy(t -> t.route));

        Map<Boolean, List<PassengerTrip>> peakSplit =
                trips.stream()
                     .collect(Collectors.partitioningBy(t -> t.peakTime));

        DoubleSummaryStatistics fareStats =
                trips.stream()
                     .collect(Collectors.summarizingDouble(t -> t.fare));

        System.out.println("Trips by Route: " + byRoute.keySet());
        System.out.println("Peak Trips: " + peakSplit.get(true).size());
        System.out.println("Total Revenue: ₹" + fareStats.getSum());
        System.out.println("Average Fare: ₹" + fareStats.getAverage());
    }
}
