package com.hospitalpatientmanagementsystem;

public class OutPatient extends Patient {

    private boolean emergency;

    // Overloaded constructor for emergency
    public OutPatient(int patientId, String name, String medicalHistory, boolean emergency) {
        super(patientId, name, medicalHistory);
        this.emergency = emergency;
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient: " + getSummary() +
                ", Emergency: " + emergency);
    }
}
