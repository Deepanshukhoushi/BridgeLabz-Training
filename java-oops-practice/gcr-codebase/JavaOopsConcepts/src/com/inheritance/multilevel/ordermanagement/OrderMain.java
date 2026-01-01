package com.inheritance.multilevel.ordermanagement;

public class OrderMain {
    public static void main(String[] args) {

        Order order = new Order(101, "01-Jan-2026");
        ShippedOrder shippedOrder =
                new ShippedOrder(102, "02-Jan-2026", "TRK123");
        DeliveredOrder deliveredOrder =
                new DeliveredOrder(103, "03-Jan-2026", "TRK456", "05-Jan-2026");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
