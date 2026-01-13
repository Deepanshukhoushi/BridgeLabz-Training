package com.trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class VehicleQueue {
    private Queue<String> queue = new LinkedList<>();
    private int capacity;

    public VehicleQueue(int capacity) {
        this.capacity = capacity;
    }

    public void enqueue(String vehicle) {
        if (queue.size() == capacity) {
            System.out.println("Queue Overflow: Waiting area full");
            return;
        }
        queue.add(vehicle);
        System.out.println("Vehicle added to waiting queue");
    }

    public String dequeue() {
        if (queue.isEmpty()) {
            System.out.println("Queue Underflow: No vehicle waiting");
            return null;
        }
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Waiting Queue: " + queue);
    }
}
