package com.constructor.level1;

public class ProductMain {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        p1.displayProductDetails();

        Product p2 = new Product("Mouse", 799);
        p2.displayProductDetails();

        Product p3 = new Product("Keyboard", 1299);
        p3.displayProductDetails();

        // Call static method using class name
        Product.displayTotalProducts();
    }
}
