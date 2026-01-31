package com.functionalinterface.markerinterface.cloningprototypeobjects;

public class VehiclePrototype implements Cloneable {

    private String model;
    private int maxSpeed;

    public VehiclePrototype(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public VehiclePrototype clone() {
        try {
            return (VehiclePrototype) super.clone(); 
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported", e);
        }
    }
}
