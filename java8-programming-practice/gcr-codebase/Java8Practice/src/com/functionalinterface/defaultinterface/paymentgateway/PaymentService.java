package com.functionalinterface.defaultinterface.paymentgateway;

public class PaymentService {

    public static void main(String[] args) {

        PaymentProcessor razorpay = new RazorpayProcessor();
        PaymentProcessor stripe = new StripeProcessor();

        razorpay.processPayment(1000);
        razorpay.refund(200);   

        stripe.processPayment(1500);
        stripe.refund(300);   
    }
}
