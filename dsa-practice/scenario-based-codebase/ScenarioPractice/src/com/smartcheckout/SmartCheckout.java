package com.smartcheckout;
import java.util.*;
public class SmartCheckout {
    private final Queue<Customer> customerQueue = new LinkedList<>();
    private final Map<String, Double> priceMap = new HashMap<>();
    private final Map<String, Integer> stockMap = new HashMap<>();

    public SmartCheckout() {
        priceMap.put("Milk", 40.0);
        priceMap.put("Bread", 30.0);
        priceMap.put("Eggs", 6.0);

        stockMap.put("Milk", 10);
        stockMap.put("Bread", 8);
        stockMap.put("Eggs", 24);
    }

    public void addCustomer(Customer customer) {
        customerQueue.offer(customer);
        System.out.println(customer.getName() + " added to queue.");
    }

    public void processNextCustomer() {
        if (customerQueue.isEmpty()) {
            System.out.println("No customers in queue.");
            return;
        }

        Customer customer = customerQueue.poll();
        double totalBill = 0;

        System.out.println("\nBilling for: " + customer.getName());

        for (String item : customer.getItems()) {
            if (stockMap.containsKey(item) && stockMap.get(item) > 0) {
                totalBill += priceMap.get(item);
                stockMap.put(item, stockMap.get(item) - 1);
                System.out.println(item + " purchased.");
            } else {
                System.out.println(item + " out of stock.");
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
    }
}
