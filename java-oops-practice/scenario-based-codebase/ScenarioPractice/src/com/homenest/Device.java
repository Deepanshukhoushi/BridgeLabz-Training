package com.homenest;
public abstract class Device implements IControllable {
    private final String deviceId;
    private boolean status;          
    protected double energyUsage;    
    protected Device(String deviceId, double energyUsage) {
        this.deviceId = deviceId;
        this.energyUsage = energyUsage;
        this.status = false;
        logFirmwareUpdate();
    }

    public String getDeviceId() {
        return deviceId;
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    public double getEnergyUsage() {
        return energyUsage;
    }

    protected void logFirmwareUpdate() {
        System.out.println("Firmware log created for device: " + deviceId);
    }

    public double calculateEnergy(double hours) {
        return energyUsage * hours;
    }
}
