package com.foreachmethod;

import java.util.*;

public class IoTSensorReadings {
    public static void main(String[] args) {

        List<Double> sensorReadings = Arrays.asList(
            28.5, 31.2, 26.8, 35.0, 29.9, 40.3
        );

        double threshold = 30.0;

        System.out.println("Sensor readings above threshold (" + threshold + "):");

        sensorReadings.stream()
                      // 🔹 filter readings above threshold
                      .filter(reading -> reading > threshold)

                      // 🔹 print readings
                      .forEach(reading ->
                          System.out.println("Alert Reading: " + reading)
                      );
    }
}
