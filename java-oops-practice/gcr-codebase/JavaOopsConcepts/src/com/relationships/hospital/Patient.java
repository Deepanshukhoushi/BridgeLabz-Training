package com.relationships.hospital;

import java.util.ArrayList;

public class Patient {

    private String patientName;
    private ArrayList<Doctor> doctorsConsulted;

    public Patient(String patientName) {
        this.patientName = patientName;
        this.doctorsConsulted = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void addDoctor(Doctor doctor) {
        doctorsConsulted.add(doctor);
    }

    public void showConsultedDoctors() {
        System.out.println(patientName + " consulted:");
        for (Doctor doctor : doctorsConsulted) {
            System.out.println("- Dr. " + doctor.getDoctorName());
        }
    }
}
