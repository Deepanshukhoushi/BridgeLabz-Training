package com.smartcheckout;
import java.util.List;

public class Customer {
    private final String name;
    private final List<String> items;

    public Customer(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<String> getItems() {
        return items;
    }
}



