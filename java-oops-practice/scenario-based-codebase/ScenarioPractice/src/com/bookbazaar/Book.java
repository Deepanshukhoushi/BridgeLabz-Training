package com.bookbazaar;

public abstract class Book implements IDiscountable {

    protected String title;
    protected String author;
    protected double price;

    private int stock; // inventory is protected

    public Book(String title, String author, double price, int stock) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    // Inventory can be updated only through methods
    public void reduceStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        }
    }
}
