package com.bookbazaar;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String userName;
    private List<Book> books = new ArrayList<>();
    private double totalAmount;

    private String status = "CREATED"; // restricted access

    public Order(String userName) {
        this.userName = userName;
    }

    public void addBook(Book book, int quantity) {
        double discount = book.applyDiscount(quantity);
        double cost = (book.price * quantity) - discount;

        totalAmount += cost;
        book.reduceStock(quantity);
        books.add(book);
    }

    void updateStatus(String newStatus) { // package-private
        status = newStatus;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }
}

