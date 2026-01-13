package com.homenest;
public class Camera extends Device {
    public Camera(String deviceId) {
        super(deviceId, 1.2);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera recording started");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera turned OFF");
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: memory cleared");
    }
}
