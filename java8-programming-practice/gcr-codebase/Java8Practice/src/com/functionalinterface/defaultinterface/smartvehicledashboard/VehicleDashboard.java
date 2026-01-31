package com.functionalinterface.defaultinterface.smartvehicledashboard;

public interface VehicleDashboard {

    void displaySpeed(int speed);

    default void displayBatteryPercentage(int percentage) {

        System.out.println("Battery information not available for this vehicle.");
    }
}
