package com.sorting.insertionsort.tailorshop;

import java.util.List;

public class SortOrders {
	public static void sortOrder(List<Order> orders) {
		int n = orders.size();
		
		for(int i = 1; i<n; i++) {
			Order key = orders.get(i);
			int j = i-1;
			
			while (j >= 0 && orders.get(j).getDeadLine().isAfter(key.getDeadLine())) {
				orders.set(j+1, orders.get(j));
				j--;
			}
			j++;
			orders.set(j, key);
		}
	}
	
	public static void displayResult(List<Order> orders) {
		for(Order order : orders) {
			System.out.println(order);
		}
	}
}
