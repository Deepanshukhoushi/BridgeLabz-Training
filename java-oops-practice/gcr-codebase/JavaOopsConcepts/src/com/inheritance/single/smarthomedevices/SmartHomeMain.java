package com.inheritance.single.smarthomedevices;

public class SmartHomeMain {
	public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("THERMO-101", true, 24);
        thermostat.displayStatus();
    }
}
