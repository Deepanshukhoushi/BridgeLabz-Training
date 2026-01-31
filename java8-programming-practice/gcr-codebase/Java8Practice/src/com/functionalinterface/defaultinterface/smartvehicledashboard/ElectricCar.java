package com.functionalinterface.defaultinterface.smartvehicledashboard;

public class ElectricCar implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Electric car speed: " + speed + " km/h");
    }

    @Override
    public void displayBatteryPercentage(int percentage) {
        System.out.println("Battery level: " + percentage + "%");
    }
}
