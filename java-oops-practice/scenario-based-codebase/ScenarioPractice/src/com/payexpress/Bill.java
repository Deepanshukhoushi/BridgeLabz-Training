package com.payexpress;
import java.time.LocalDate;
public abstract class Bill implements IPayable {
    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    private boolean isPaid;   

    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    @Override
    public void pay() {
        if (!isPaid) {
            isPaid = true;
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println(type + " bill already paid.");
        }
    }

    protected boolean isPaid() {
        return isPaid;
    }
}
