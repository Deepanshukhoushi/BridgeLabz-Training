package com.lambdaexpressions.ecommercesorting;
import java.util.*;

public class ECommerceSorting {
    @SuppressWarnings("resource")
	public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", 60000, 4.5, 10));
        products.add(new Product(2, "Mobile", 30000, 4.2, 15));
        products.add(new Product(3, "Headphones", 2000, 4.8, 25));
        products.add(new Product(4, "Smart Watch", 10000, 4.0, 5));

        Scanner sc = new Scanner(System.in);

        System.out.println("Choose sorting option:");
        System.out.println("1. Sort by Price (Low to High)");
        System.out.println("2. Sort by Rating (High to Low)");
        System.out.println("3. Sort by Discount (High to Low)");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
                System.out.println("\nSorted by Price:");
                break;

            case 2:
                products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
                System.out.println("\nSorted by Rating:");
                break;

            case 3:
                products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
                System.out.println("\nSorted by Discount:");
                break;

            default:
                System.out.println("Invalid choice!");
                return;
        }

        products.forEach(System.out::println);
        sc.close();
    }
}
