package com.constructor.level1;

public class HotelBookingMain {

    public static void main(String[] args) {

        // Using default constructor
        HotelBooking booking1 = new HotelBooking();
        booking1.displayBookingDetails();

        // Using parameterized constructor
        HotelBooking booking2 =
                new HotelBooking("Amit Sharma", "Deluxe", 3);
        booking2.displayBookingDetails();

        // Using copy constructor
        HotelBooking booking3 = new HotelBooking(booking2);
        booking3.displayBookingDetails();
    }
}
