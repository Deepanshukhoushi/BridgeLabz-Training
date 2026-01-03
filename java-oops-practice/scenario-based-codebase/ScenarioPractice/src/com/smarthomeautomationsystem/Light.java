package com.smarthomeautomationsystem;

class Light extends Appliance {

    public Light() {
        super(40);
    }

    @Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("Light turned ON (Soft lighting)");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("Light turned OFF");
    }
}
