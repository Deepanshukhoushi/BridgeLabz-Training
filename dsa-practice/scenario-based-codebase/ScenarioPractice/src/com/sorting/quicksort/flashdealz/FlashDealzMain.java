package com.sorting.quicksort.flashdealz;
import java.util.Scanner;
public class FlashDealzMain {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter no. of Products: ");
    	
    	int size = input.nextInt();
    	Product[] products = new Product[size];
    	for(int i = 0; i<size; i++) {
    		System.out.println("Enter Product Name, and Discount: ");
        	String product = input.next();
        	int discount = input.nextInt();
            products[i] = new Product(product, discount);
    	}

        FlashDealzQuickSort.quickSort(products, 0, products.length - 1);

        for (Product p : products) {
            System.out.println(p.name + " - " + p.discount + "%");
        }
        input.close();
    }
}
