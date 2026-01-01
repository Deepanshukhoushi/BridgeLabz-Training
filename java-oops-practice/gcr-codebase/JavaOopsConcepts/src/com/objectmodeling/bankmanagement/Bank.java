package com.objectmodeling.bankmanagement;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private String name;
    private List<Customer> customers;

    // Constructor
    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    // Add customer to bank
    public void addCustomer(Customer customer) {
        customers.add(customer);
        System.out.println("Customer added: " + customer.getName());
    }

    // Display all customers
    public void showCustomers() {
        System.out.println("Bank: " + name + " Customers:");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
