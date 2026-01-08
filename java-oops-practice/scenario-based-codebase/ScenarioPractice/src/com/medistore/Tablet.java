package com.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Tablet expiry date: " + getExpiryDate());
    }
}
