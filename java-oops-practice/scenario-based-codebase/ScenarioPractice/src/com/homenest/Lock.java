package com.homenest;
public class Lock extends Device {
    public Lock(String deviceId) {
        super(deviceId, 0.2);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Door locked");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Door unlocked");
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: security code refreshed");
    }
}
