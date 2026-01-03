package com.ewalletapplication;

public class User {

    private String name;
    private Wallet wallet;

    // Constructor without referral bonus
    public User(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    // Constructor with referral bonus
    public User(String name, Wallet wallet, double referralBonus) {
        this.name = name;
        this.wallet = wallet;
        this.wallet.add(referralBonus);
    }

    public String getName() {
        return name;
    }

    public Wallet getWallet() {
        return wallet;
    }
}
