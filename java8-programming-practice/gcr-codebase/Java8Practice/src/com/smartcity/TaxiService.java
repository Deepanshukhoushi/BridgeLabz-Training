package com.smartcity;

class TaxiService implements TransportService {

    public String getServiceName() { return "City Taxi"; }
    public double getFare() { return 120.0; }
    public String getRoute() { return "Door to Door"; }

    public void startService() {
        System.out.println("Taxi started");
    }

    public void stopService() {
        System.out.println("Taxi stopped");
    }
}
