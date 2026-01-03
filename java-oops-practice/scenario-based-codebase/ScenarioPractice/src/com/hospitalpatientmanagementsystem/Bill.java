package com.hospitalpatientmanagementsystem;

public class Bill implements Payable {

    private double baseAmount;
    private double taxRate = 0.05;
    private double discountRate = 0.10;

    public Bill(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    @Override
    public double calculatePayment() {
        double tax = baseAmount * taxRate;
        double discount = baseAmount * discountRate;
        return baseAmount + tax - discount;
    }
}
