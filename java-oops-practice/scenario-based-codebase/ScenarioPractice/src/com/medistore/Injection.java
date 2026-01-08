package com.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Injection expiry (preserved): " + getExpiryDate());
    }
}
