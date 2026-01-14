package com.payexpress;
import java.time.LocalDate;
public class ElectricityBill extends Bill {
    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            double total = calculateLateFee(50);
            System.out.println("Electricity Bill Reminder!");
            System.out.println("Pay ₹" + total + " before " + dueDate);
        }
    }
}
