package com.javagenerics.dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

class ProductCatalog {

    private final List<Product<? extends Category>> products = new ArrayList<>();

    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }

    public void displayProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        for (Product<? extends Category> product : products) {
            System.out.println(product);
        }
    }

    public List<Product<? extends Category>> getProducts() {
        return products;
    }
}
