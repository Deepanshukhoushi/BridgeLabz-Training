package com.encapsulationandpolymorphism.hospitalpatientmanagement;

import java.util.ArrayList;
import java.util.List;

public class HospitalApp {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        Patient inPatient = new InPatient(1, "Amit", 45, 5, 3000);
        Patient outPatient = new OutPatient(2, "Riya", 30, 800);

        ((MedicalRecord) inPatient).addRecord("Diagnosed with pneumonia");
        ((MedicalRecord) outPatient).addRecord("Routine health checkup");

        patients.add(inPatient);
        patients.add(outPatient);

        BillingProcessor.processPatients(patients);
    }
}

