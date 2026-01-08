package com.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Syrup (liquid) expires faster: " + getExpiryDate());
    }
}

