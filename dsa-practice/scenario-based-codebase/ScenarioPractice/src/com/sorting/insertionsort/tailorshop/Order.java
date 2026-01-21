package com.sorting.insertionsort.tailorshop;

import java.time.LocalTime;

public class Order {
	private int orderId;
	private LocalTime deadLine;
	private LocalTime delivery;
	
	public Order(int orderId, LocalTime deadLine, LocalTime delivery) {
		this.orderId = orderId;
		this.deadLine = deadLine;
		this.delivery  = delivery;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public LocalTime getDeadLine() {
		return deadLine;
	}
	
	public LocalTime getDelivery() {
		return delivery;
	} 
	
	@Override
	public String toString() {
		return "Order Id: " + orderId + ", Deadline: " + deadLine + ", delivery: " + delivery;
	}
}
