package com.smartcity;

class AmbulanceService implements TransportService, EmergencyService {

    public String getServiceName() { return "Ambulance"; }
    public double getFare() { return 0.0; }
    public String getRoute() { return "Emergency Route"; }

    public void startService() {
        System.out.println("Ambulance rushing ");
    }

    public void stopService() {
        System.out.println("Ambulance stopped");
    }
}
