package com.managebankcustomers;

class CurrentAccount extends Account {

    private static final double INTEREST_RATE = 1.0;

    public CurrentAccount(String accountNumber) {
        super(accountNumber);
    }

    public CurrentAccount(String accountNumber, double openingBalance) {
        super(accountNumber, openingBalance);
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE / 100;
        setBalance(getBalance() + interest);
        System.out.println("Current Account Interest Added: ₹" + interest);
    }
}
