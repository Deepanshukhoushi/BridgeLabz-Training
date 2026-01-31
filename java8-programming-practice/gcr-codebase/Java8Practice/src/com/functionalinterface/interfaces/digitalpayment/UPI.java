package com.functionalinterface.interfaces.digitalpayment;

class UPI implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Rs. using UPI");
    }
}
