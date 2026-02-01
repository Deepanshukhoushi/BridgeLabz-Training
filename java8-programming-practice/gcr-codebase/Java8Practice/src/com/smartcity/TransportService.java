package com.smartcity;

interface TransportService {
    String getServiceName();
    double getFare();
    String getRoute();

    void startService();
    void stopService();

    default void printServiceDetails() {
        System.out.println(getServiceName()
                + " | Route: " + getRoute()
                + " | Fare: " + getFare());
    }
}
