package com.cabbygoridehailing;

class Mini extends Vehicle {
    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini");
    }

    public double getRatePerKm() {
        return 10;
    }

    public double getBaseFare() {
        return 50;
    }
}