package com.payexpress;
import java.time.LocalDate;
public class WaterBill extends Bill {
    public WaterBill(double amount, LocalDate dueDate) {
        super("Water", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            double total = calculateLateFee(20);
            System.out.println("Water Bill Reminder!");
            System.out.println("Pay ₹" + total + " before " + dueDate);
        }
    }
}
