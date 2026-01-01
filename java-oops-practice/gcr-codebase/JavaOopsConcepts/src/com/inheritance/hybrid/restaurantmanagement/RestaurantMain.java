package com.inheritance.hybrid.restaurantmanagement;

public class RestaurantMain {
    public static void main(String[] args) {

        Worker chef = new Chef("Rahul", 101);
        Worker waiter = new Waiter("Amit", 102);

        chef.performDuties();
        System.out.println();

        waiter.performDuties();
    }
}
