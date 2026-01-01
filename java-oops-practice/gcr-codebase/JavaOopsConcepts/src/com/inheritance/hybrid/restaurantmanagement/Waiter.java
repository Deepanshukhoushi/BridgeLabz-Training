package com.inheritance.hybrid.restaurantmanagement;

public class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter Duties:");
        System.out.println("Name : " + name);
        System.out.println("Role : Serving food and assisting customers");
    }
}
