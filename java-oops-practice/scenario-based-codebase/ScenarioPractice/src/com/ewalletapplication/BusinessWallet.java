package com.ewalletapplication;

public class BusinessWallet extends Wallet {

    private static final double TAX_RATE = 0.02; // 2% tax

    public BusinessWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {

        double tax = amount * TAX_RATE;
        double totalDeduction = amount + tax;

        if (deduct(totalDeduction)) {
            receiver.getWallet().add(amount);
            addTransaction("Business transfer (Tax ₹" + tax + ")", -totalDeduction);
            receiver.getWallet().addTransaction("Received from business", amount);
            return true;
        }

        System.out.println("Insufficient balance for business transfer");
        return false;
    }
}
