package com.exceptions.banktransactionsystem;

@SuppressWarnings("serial")
class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
