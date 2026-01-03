package com.hospitalpatientmanagementsystem;

public class InPatient extends Patient {

    private int numberOfDays;

    // Normal admission
    public InPatient(int patientId, String name, String medicalHistory, int numberOfDays) {
        super(patientId, name, medicalHistory);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient: " + getSummary() +
                ", Days Admitted: " + numberOfDays);
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
