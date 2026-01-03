package com.cabbygoridehailing;

class SUV extends Vehicle {
    public SUV(String vehicleNumber) {
        super(vehicleNumber, 6, "SUV");
    }

    public double getRatePerKm() {
        return 20;
    }

    public double getBaseFare() {
        return 120;
    }
}