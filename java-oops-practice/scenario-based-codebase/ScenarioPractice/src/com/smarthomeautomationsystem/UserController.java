package com.smarthomeautomationsystem;

public class UserController {

    public static void compareEnergy(Appliance a1, Appliance a2) {
        if (a1.getEnergyUsage() > a2.getEnergyUsage()) {
            System.out.println("First appliance consumes more energy");
        } else if (a1.getEnergyUsage() < a2.getEnergyUsage()) {
            System.out.println("Second appliance consumes more energy");
        } else {
            System.out.println("Both appliances consume equal energy");
        }
    }

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC();

        light.turnOn();
        fan.turnOn();
        ac.turnOn();

        compareEnergy(fan, ac);

        ac.turnOff();
    }
}
