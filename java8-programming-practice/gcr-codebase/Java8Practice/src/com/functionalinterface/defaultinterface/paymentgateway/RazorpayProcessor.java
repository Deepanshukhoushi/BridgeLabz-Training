package com.functionalinterface.defaultinterface.paymentgateway;

public class RazorpayProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println(
            "Payment of " + amount + " Rs. processed via Razorpay."
        );
    }
}
