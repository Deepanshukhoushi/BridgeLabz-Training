package com.parkease;

public class ParkingSlot {

    private int slotId;
    private boolean isOccupied;
    private String vehicleTypeAllowed;

    public ParkingSlot(int slotId, String vehicleTypeAllowed) {
        this.slotId = slotId;
        this.vehicleTypeAllowed = vehicleTypeAllowed;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void occupySlot() {
        isOccupied = true;
    }

    public void freeSlot() {
        isOccupied = false;
    }

    public String getVehicleTypeAllowed() {
        return vehicleTypeAllowed;
    }
}
