package com.relationships.ecommerce;

public class EcommerceDemo {

    public static void main(String[] args) {

        // Create Customer
        Customer customer = new Customer("Amit");

        // Create Products (independent)
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mouse", 800);
        Product p3 = new Product("Keyboard", 1200);

        // Create Order
        Order order = new Order(101);

        // Aggregation: Order contains products
        order.addProduct(p1);
        order.addProduct(p2);
        order.addProduct(p3);

        // Communication: Customer places order
        customer.placeOrder(order);

        // Display Order
        order.showOrderDetails();
    }
}
