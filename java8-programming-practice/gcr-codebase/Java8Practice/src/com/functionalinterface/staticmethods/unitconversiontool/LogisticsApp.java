package com.functionalinterface.staticmethods.unitconversiontool;
import java.util.Scanner;
public class LogisticsApp {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("Enter distance in Km: ");
        double distanceKm = input.nextDouble();
        
        System.out.println("Enter Weight in Kg: ");
        double weightKg = input.nextDouble();

        System.out.println("Distance in miles: " 
                + UnitConverter.kmToMiles(distanceKm));

        System.out.println("Weight in lbs: " 
                + UnitConverter.kgToLbs(weightKg));
        
        input.close();
    }
}
