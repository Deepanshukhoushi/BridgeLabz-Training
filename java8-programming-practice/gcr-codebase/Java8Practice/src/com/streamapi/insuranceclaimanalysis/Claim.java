package com.streamapi.insuranceclaimanalysis;

class Claim {
    String claimType;
    double amount;

    Claim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }
}
