package com.relationships.hospital;

public class HospitalDemo {

    public static void main(String[] args) {

        // Create Hospital
        Hospital hospital = new Hospital("City Care Hospital");

        // Create Doctors
        Doctor d1 = new Doctor("Arjun");
        Doctor d2 = new Doctor("Meera");

        // Create Patients
        Patient p1 = new Patient("Rahul");
        Patient p2 = new Patient("Anita");

        // Add to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (Association + Communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        System.out.println();

        // Display results
        d1.showPatients();
        System.out.println();

        p1.showConsultedDoctors();
    }
}