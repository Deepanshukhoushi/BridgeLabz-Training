package com.functionalinterface.markerinterface.cloningprototypeobjects;

public class PrototypeApp {

    public static void main(String[] args) {

        VehiclePrototype original =
                new VehiclePrototype("Electric SUV", 180);

        VehiclePrototype copy = original.clone();

        System.out.println("Original Model: " + original.getModel());
        System.out.println("Cloned Model: " + copy.getModel());

        System.out.println("Same object? " + (original == copy));
    }
}
