package com.lambdaexpressions.smarthomelightingautomation;

public class SmartHomeLighting {

    public static void main(String[] args) {
    
        LightAction motionTrigger = () -> 
            System.out.println("Motion detected: Turning ON bright white lights.");

        LightAction eveningTrigger = () -> 
            System.out.println("Evening time: Turning ON warm dim lights.");

        LightAction voiceCommandTrigger = () -> 
            System.out.println("Voice command received: Activating PARTY MODE lights!");

        activateLight(motionTrigger);
        activateLight(eveningTrigger);
        activateLight(voiceCommandTrigger);
    }

    static void activateLight(LightAction action) {
        action.activate();
    }
}
