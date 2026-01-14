package com.smartcheckout;
/*. SmartCheckout – Supermarket Billing Queue (Queue + HashMap)
Story: At a supermarket, each checkout counter maintains a Queue of customers. Each
customer has a list of items, and a HashMap is used to fetch price and stock quickly.
Requirements:
● Add/remove customers from the queue.
● Fetch item prices from map.
● Update stock on purchase.
*/

import java.util.List;
import java.util.Scanner;
public class SmartCheckoutApp {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        SmartCheckout checkout = new SmartCheckout();
        System.out.println("Enter number of customers: ");
        int num = input.nextInt();
        for (int i = 0; i<num; i++) {
        	String customerName = input.next();
        	String productOne = input.next();
        	String productTwo = input.next();
        	Customer c1 = new Customer(customerName, List.of(productOne, productTwo));
        	checkout.addCustomer(c1);
        	checkout.processNextCustomer();
        }
        System.out.println("Closed...");
        input.close();
    }
}
