package com.cabbygoridehailing;

class Sedan extends Vehicle {
    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    public double getRatePerKm() {
        return 15;
    }

    public double getBaseFare() {
        return 80;
    }
}
