package com.functionalinterface.defaultinterface.smartvehicledashboard;

public class Car implements VehicleDashboard {

    @Override
    public void displaySpeed(int speed) {
        System.out.println("Car speed: " + speed + " km/h");
    }
}
