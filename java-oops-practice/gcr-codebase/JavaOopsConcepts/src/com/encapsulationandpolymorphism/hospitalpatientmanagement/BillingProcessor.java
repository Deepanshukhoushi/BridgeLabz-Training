package com.encapsulationandpolymorphism.hospitalpatientmanagement;
import java.util.List;

public class BillingProcessor {

    public static void processPatients(List<Patient> patients) {

        for (Patient patient : patients) {

            patient.getPatientDetails();

            double billAmount = patient.calculateBill();
            System.out.println("Total Bill: ₹" + billAmount);

            if (patient instanceof MedicalRecord) {
                ((MedicalRecord) patient).viewRecords();
            }

            System.out.println("----------------------------------");
        }
    }
}