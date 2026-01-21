package com.sorting.insertionsort.tailorshop;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShopMain {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Order> orders = new ArrayList<>();
		
		System.out.println("Enter no. of orders: ");
		int num = input.nextInt();
		
		for(int i =0; i<num; i++) {
			System.out.println("Enter Order Id: ");
			int orderId = input.nextInt();
			input.nextLine();
			
			System.out.println("Enter DeadLine: ");
			String dead = input.nextLine().trim();
			
			LocalTime deadLine = LocalTime.parse(dead);
			System.out.println("Enter Delivery Time: ");
			
			String time = input.nextLine().trim();
			LocalTime delivery = LocalTime.parse(time);
			
			orders.add(new Order(orderId, deadLine, delivery));
			System.out.println((i+1) + " Order " +  "Added!\n");
		}
		input.close();
		SortOrders.sortOrder(orders);
		System.out.println("Orders are sorted by DeadLine!");
		
		SortOrders.displayResult(orders);
	}
}
