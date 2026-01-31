package com.functionalinterface.defaultinterface.paymentgateway;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println(
            "Payment of " + amount + " Rs. processed via Stripe."
        );
    }

    @Override
    public void refund(double amount) {
        System.out.println(
            "Stripe refund of " + amount + " Rs. completed instantly."
        );
    }
}
