package com.functionalinterface.digitalpayment;

class Wallet implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Rs. using Wallet");
    }
}
