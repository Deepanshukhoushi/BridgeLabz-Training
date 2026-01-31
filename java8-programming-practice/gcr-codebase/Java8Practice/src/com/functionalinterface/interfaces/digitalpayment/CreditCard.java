package com.functionalinterface.interfaces.digitalpayment;

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Rs. using Credit Card");
    }
}
