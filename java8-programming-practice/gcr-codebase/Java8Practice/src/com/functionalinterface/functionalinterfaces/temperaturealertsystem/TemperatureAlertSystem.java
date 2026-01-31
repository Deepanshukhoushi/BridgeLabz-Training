package com.functionalinterface.functionalinterfaces.temperaturealertsystem;

import java.util.Scanner;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Enter alert threshold temperature: ");
        double threshold = sc.nextDouble();

        Predicate<Double> isHighTemperature = temp -> temp > threshold;

        if (isHighTemperature.test(temperature)) {
            System.out.println("ALERT: Temperature crossed the threshold!");
        } else {
            System.out.println("Temperature is normal.");
        }

        sc.close();
    }
}
