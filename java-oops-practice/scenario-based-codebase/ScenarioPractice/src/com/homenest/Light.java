package com.homenest;
public class Light extends Device {
    public Light(String deviceId) {
        super(deviceId, 0.5);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light turned ON");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Light reset: brightness set to default");
    }
}
