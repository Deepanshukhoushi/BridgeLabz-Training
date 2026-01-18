package com.javagenerics.dynamiconlinemarketplace;

class Product<T extends Category> {

    private final String name;
    private final T category;
    private double price;

    public Product(String name, T category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public T getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return name + " | Category: " + category + " | Price: ₹" + price;
    }
}
