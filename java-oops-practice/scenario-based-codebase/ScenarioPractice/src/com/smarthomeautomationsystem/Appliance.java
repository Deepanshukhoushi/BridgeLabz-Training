package com.smarthomeautomationsystem;

abstract class Appliance implements Controllable {

    private boolean powerOn;
    private int energyUsage; // watts

    public Appliance(int energyUsage) {
        this.energyUsage = energyUsage;
        this.powerOn = false;
    }

    protected void setPowerState(boolean state) {
        powerOn = state;
    }

    public boolean isPowerOn() {
        return powerOn;
    }

    public int getEnergyUsage() {
        return energyUsage;
    }
}

