package com.relationships.ecommerce;

public class Customer {

    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    public void placeOrder(Order order) {
        System.out.println("\nCustomer " + customerName +
                " placed Order #" + order.getOrderId());
    }

    public String getCustomerName() {
        return customerName;
    }
}
