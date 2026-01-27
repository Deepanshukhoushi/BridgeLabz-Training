package com.dealtracker;

import java.time.LocalDate;

public class Deal implements Promotion {

    private String dealCode;
    private LocalDate validTill;
    private int discount;
    private int minimumPurchase;

    public Deal(String dealCode, LocalDate validTill,
                int discount, int minimumPurchase) {
        this.dealCode = dealCode;
        this.validTill = validTill;
        this.discount = discount;
        this.minimumPurchase = minimumPurchase;
    }

    @Override
    public String getCode() {
        return dealCode;
    }

    public LocalDate getValidTill() {
        return validTill;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return dealCode +
               " | " + discount + "% OFF" +
               " | Valid Till: " + validTill +
               " | Min ₹" + minimumPurchase;
    }
}
