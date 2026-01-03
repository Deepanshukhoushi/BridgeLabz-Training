package com.hospitalpatientmanagementsystem;
public abstract class Patient {

    private int patientId;
    private String name;
    private String medicalHistory; // sensitive

    public Patient(int patientId, String name, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }

    public abstract void displayInfo();

    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name;
    }
}
