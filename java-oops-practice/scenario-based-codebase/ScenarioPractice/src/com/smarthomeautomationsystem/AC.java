package com.smarthomeautomationsystem;

public class AC extends Appliance {
	
	public AC() {
		super(30);
	}
	@Override
    public void turnOn() {
        setPowerState(true);
        System.out.println("AC turned On");
    }

    @Override
    public void turnOff() {
        setPowerState(false);
        System.out.println("AC turned OFF");
    }
}

