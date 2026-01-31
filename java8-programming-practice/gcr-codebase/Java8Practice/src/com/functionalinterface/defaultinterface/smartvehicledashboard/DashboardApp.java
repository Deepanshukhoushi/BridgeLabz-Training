package com.functionalinterface.defaultinterface.smartvehicledashboard;

public class DashboardApp {

    public static void main(String[] args) {

        VehicleDashboard car = new Car();
        VehicleDashboard electricCar = new ElectricCar();

        car.displaySpeed(80);
        car.displayBatteryPercentage(0);   

        electricCar.displaySpeed(90);
        electricCar.displayBatteryPercentage(65);
    }
}
