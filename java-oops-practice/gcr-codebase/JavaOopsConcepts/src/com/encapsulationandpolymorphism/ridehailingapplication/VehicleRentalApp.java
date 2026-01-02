package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("DL01AB1234", 2000));
        vehicles.add(new Bike("DL05XY6789", 800));
        vehicles.add(new Truck("HR26TR9999", 5000));

        RentalProcessor.processRentals(vehicles, 3);
    }
}

