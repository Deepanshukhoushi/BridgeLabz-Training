package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle car = new Car(101, "Amit");
        Vehicle bike = new Bike(102, "Riya");
        Vehicle auto = new Auto(103, "Rahul");

        ((GPS) car).updateLocation("Connaught Place");
        ((GPS) bike).updateLocation("Karol Bagh");
        ((GPS) auto).updateLocation("Rajiv Chowk");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(auto);

        FareCalculator.calculateFares(vehicles, 10);
    }
}