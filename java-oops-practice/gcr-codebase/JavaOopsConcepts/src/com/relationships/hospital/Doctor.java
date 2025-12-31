package com.relationships.hospital;

import java.util.ArrayList;

public class Doctor {

    private String doctorName;
    private ArrayList<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    // Communication method
    public void consult(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);

        System.out.println("Dr. " + doctorName +
                " is consulting patient " + patient.getPatientName());
    }

    public void showPatients() {
        System.out.println("Patients consulted by Dr. " + doctorName + ":");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getPatientName());
        }
    }
}