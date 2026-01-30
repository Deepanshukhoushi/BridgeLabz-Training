package com.functionalinterface.vehiclerentalsystem;

public class VehicleRentalApp {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bus = new Bus();

        car.rent();
        bike.rent();
        bus.rent();

        System.out.println("---- Returning Vehicles ----");

        car.returnVehicle();
        bike.returnVehicle();
        bus.returnVehicle();
    }
}
