package com.ewalletapplication;

public class PersonalWallet extends Wallet {

    private static final double TRANSFER_LIMIT = 5000;

    public PersonalWallet(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean transferTo(User receiver, double amount) {

        if (amount > TRANSFER_LIMIT) {
            System.out.println("Transfer limit exceeded (Personal Wallet)");
            return false;
        }

        if (deduct(amount)) {
            receiver.getWallet().add(amount);
            addTransaction("Sent to " + receiver.getName(), -amount);
            receiver.getWallet().addTransaction("Received from " + receiver.getName(), amount);
            return true;
        }

        System.out.println("Insufficient balance");
        return false;
    }
}
