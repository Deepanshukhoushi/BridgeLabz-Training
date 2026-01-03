package com.vehiclerentalapplication;

public class VehicleRentalApp {

    public static void main(String[] args) {

        Customer customer = new Customer(1, "Amit");

        Vehicle bike = new Bike("BIKE-101");
        Vehicle car = new Car("CAR-202");
        Vehicle truck = new Truck("TRUCK-303");

        int days = 3;

        customer.displayCustomer();

        // Polymorphism
        bike.displayInfo();
        System.out.println("Rent: ₹" + bike.calculateRent(days));

        car.displayInfo();
        System.out.println("Rent: ₹" + car.calculateRent(days));

        truck.displayInfo();
        System.out.println("Rent: ₹" + truck.calculateRent(days));
    }
}
