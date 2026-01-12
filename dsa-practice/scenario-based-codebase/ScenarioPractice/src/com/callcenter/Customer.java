package com.callcenter;
class Customer {
    private final String customerId;
    private final boolean isVip;

    public Customer(String customerId, boolean isVip) {
        this.customerId = customerId;
        this.isVip = isVip;
    }

    public String getCustomerId() {
        return customerId;
    }

    public boolean isVip() {
        return isVip;
    }
}

