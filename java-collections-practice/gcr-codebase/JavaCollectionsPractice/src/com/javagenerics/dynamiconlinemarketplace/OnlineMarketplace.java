package com.javagenerics.dynamiconlinemarketplace;

import java.util.Scanner;
public class OnlineMarketplace {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ProductCatalog catalog = new ProductCatalog();

    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("\n--- Online Marketplace ---");
            System.out.println("1. Add Product");
            System.out.println("2. Apply Discount");
            System.out.println("3. Display Products");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> addProduct();
                case 2 -> applyDiscount();
                case 3 -> catalog.displayProducts();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addProduct() {
        System.out.println("\nSelect Product Type:");
        System.out.println("1. Book");
        System.out.println("2. Clothing");
        System.out.println("3. Gadget");
        System.out.print("Choice: ");
        int type = scanner.nextInt();

        scanner.nextLine(); // clear buffer
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        switch (type) {
            case 1 -> {
                BookCategory category = BookCategory.EDUCATIONAL;
                catalog.addProduct(new Product<>(name, category, price));
            }
            case 2 -> {
                ClothingCategory category = ClothingCategory.MEN;
                catalog.addProduct(new Product<>(name, category, price));
            }
            case 3 -> {
                GadgetCategory category = GadgetCategory.MOBILE;
                catalog.addProduct(new Product<>(name, category, price));
            }
            default -> System.out.println("Invalid product type!");
        }

        System.out.println("Product added successfully!");
    }

    private static void applyDiscount() {
        if (catalog.getProducts().isEmpty()) {
            System.out.println("No products to apply discount.");
            return;
        }

        catalog.displayProducts();
        System.out.print("Enter discount percentage: ");
        double percentage = scanner.nextDouble();

        for (Product<? extends Category> product : catalog.getProducts()) {
            DiscountUtil.applyDiscount(product, percentage);
        }

        System.out.println("Discount applied successfully!");
    }
}
