package com.parkease;

public class ParkingManager {

    private String bookingLog; // internal record

    public void parkVehicle(ParkingSlot slot, Vehicle vehicle, int hours) {

        if (!slot.isAvailable()) {
            System.out.println(" Slot already occupied");
            return;
        }

        slot.occupySlot();
        double charge = vehicle.calculateCharges(hours);

        bookingLog = "Vehicle parked. Charge: " + charge;
        System.out.println(" Parking Successful");
        System.out.println("Total Charges: " + charge);
    }

    public String getLogs() {
        return bookingLog;
    }
}
