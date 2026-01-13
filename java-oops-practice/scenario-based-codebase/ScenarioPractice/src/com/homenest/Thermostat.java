package com.homenest;
public class Thermostat extends Device {
    public Thermostat(String deviceId) {
        super(deviceId, 2.0);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat activated");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: temperature set to 24°C");
    }
}
