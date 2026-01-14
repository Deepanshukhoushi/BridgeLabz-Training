package com.payexpress;
import java.time.LocalDate;
public class InternetBill extends Bill {
    public InternetBill(double amount, LocalDate dueDate) {
        super("Internet", amount, dueDate);
    }

    @Override
    public void sendReminder() {
        if (!isPaid()) {
            double total = calculateLateFee(100);
            System.out.println("Internet Bill Reminder!");
            System.out.println("Pay ₹" + total + " before " + dueDate);
        }
    }
}
