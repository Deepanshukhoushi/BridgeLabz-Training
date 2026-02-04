package com.smartcity;

import java.util.Arrays;
import java.util.List;

public class SmartCityApp {

    public static void main(String[] args) {

        List<TransportService> services = Arrays.asList(
            new BusService(),
            new MetroService(),
            new TaxiService(),
            new AmbulanceService()
        );

        SmartCityDashboard.showLiveServices(services);

        FareCalculator calculator =
                distance -> distance * 10;

        double distance = GeoUtils.calculateDistance(1, 1, 4, 5);
        System.out.println("Calculated Fare: " +
                calculator.calculateFare(distance));

        List<PassengerTrip> trips = Arrays.asList(
            new PassengerTrip("A-B", 20, true),
            new PassengerTrip("A-B", 25, false),
            new PassengerTrip("Central-IT", 50, true)
        );

        TransportAnalytics.generateReports(trips);
    }
}
