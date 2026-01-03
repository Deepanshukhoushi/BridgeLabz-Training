package com.hospitalpatientmanagementsystem;

public class HospitalApp {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Rahul", "Diabetes", 5);
        Patient p2 = new OutPatient(102, "Anita", "Fever", true);

        Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

        Bill bill = new Bill(10000);

        // Polymorphism
        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill Amount: ₹" + bill.calculatePayment());
    }
}
