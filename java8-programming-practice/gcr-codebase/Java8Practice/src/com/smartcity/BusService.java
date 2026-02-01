package com.smartcity;

class BusService implements TransportService {

    public String getServiceName() { return "City Bus"; }
    public double getFare() { return 20.0; }
    public String getRoute() { return "A → B"; }

    public void startService() {
        System.out.println("Bus started");
    }

    public void stopService() {
        System.out.println("Bus stopped");
    }
}
