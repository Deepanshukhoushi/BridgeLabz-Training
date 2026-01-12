package com.callcenter;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class CallManagement {
    private final Queue<Customer> normalQueue = new LinkedList<>();
    private final PriorityQueue<Customer> vipQueue = new PriorityQueue<>((a, b) -> 0); 

    private final HashMap<String, Integer> callCountMap = new HashMap<>();

    public void receiveCall(Customer customer) {
        callCountMap.put(
                customer.getCustomerId(), 
                callCountMap.getOrDefault(customer.getCustomerId(), 0) + 1
        );

        if (customer.isVip()) {
            vipQueue.offer(customer);
            System.out.println("VIP Call Received: " + customer.getCustomerId());
        } else {
            normalQueue.offer(customer);
            System.out.println("Normal Call Received: " + customer.getCustomerId());
        }
    }

    public void handleNextCall() {
        Customer customer;

        if (!vipQueue.isEmpty()) {
            customer = vipQueue.poll();
            System.out.println("Handling VIP customer: " + customer.getCustomerId());
        } else if (!normalQueue.isEmpty()) {
            customer = normalQueue.poll();
            System.out.println("Handling normal customer: " + customer.getCustomerId());
        } else {
            System.out.println("No calls in queue");
        }
    }

    public void showCallStatistics() {
        System.out.println("\nCall Count This Month:");
        for (Map.Entry<String, Integer> entry : callCountMap.entrySet()) {
        	System.out.println("Customer " + entry.getKey() + " → " + entry.getValue() + " calls");
        }
    }
}