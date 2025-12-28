package com.constructor.level1;

public class CarRentalMain {

    public static void main(String[] args) {

        // Using default constructor
        CarRental rental1 = new CarRental();
        rental1.displayRentalDetails();

        // Using parameterized constructor
        CarRental rental2 =
                new CarRental("Rohit Verma", "SUV", 4);
        rental2.displayRentalDetails();
    }
}
