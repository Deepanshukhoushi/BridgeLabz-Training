package com.smartcity;

class MetroService implements TransportService {

    public String getServiceName() { return "Metro Rail"; }
    public double getFare() { return 50.0; }
    public String getRoute() { return "Central → IT Park"; }

    public void startService() {
        System.out.println("Metro started");
    }

    public void stopService() {
        System.out.println("Metro stopped");
    }
}
