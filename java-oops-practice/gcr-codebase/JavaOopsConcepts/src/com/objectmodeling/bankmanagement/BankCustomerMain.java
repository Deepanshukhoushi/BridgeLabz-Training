package com.objectmodeling.bankmanagement;

public class BankCustomerMain {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Punjab National Bank");

        // Create customers
        Customer cust1 = new Customer("Amit Sharma", "ACC123", 5000);
        Customer cust2 = new Customer("Sneha Verma", "ACC456", 10000);

        // Add customers to bank
        bank.addCustomer(cust1);
        bank.addCustomer(cust2);

        // Display customers
        bank.showCustomers();

        // Perform some operations
        cust1.deposit(2000);
        cust2.withdraw(3000);

        // Display updated customer info
        bank.showCustomers();
    }
}