package com.collectors.orderrevenuesummary;

import java.util.*;
import java.util.stream.Collectors;

public class OrderRevenueSummary {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Rahul", 1200.50),
            new Order("Anita", 800.00),
            new Order("Rahul", 450.75),
            new Order("Suresh", 1500.00),
            new Order("Anita", 700.25)
        );

        Map<String, Double> revenueByCustomer =
                orders.stream()
                      .collect(Collectors.groupingBy(
                          o -> o.customerName,
                          Collectors.summingDouble(o -> o.amount)
                      ));

        System.out.println("Order Revenue Summary (Per Customer):");
        revenueByCustomer.forEach(
            (customer, total) ->
                System.out.println(customer + " : " + total)
        );
    }
}
