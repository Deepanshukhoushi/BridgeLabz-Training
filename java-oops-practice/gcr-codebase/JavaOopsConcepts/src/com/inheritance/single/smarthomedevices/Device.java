package com.inheritance.single.smarthomedevices;
public class Device {

    protected String deviceId;
    protected boolean status;

    public Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID : " + deviceId);
        System.out.println("Status    : " + (status ? "ON" : "OFF"));
    }
}
