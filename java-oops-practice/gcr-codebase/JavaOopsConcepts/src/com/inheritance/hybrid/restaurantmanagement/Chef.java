package com.inheritance.hybrid.restaurantmanagement;

public class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef Duties:");
        System.out.println("Name : " + name);
        System.out.println("Role : Cooking food and managing kitchen");
    }
}
