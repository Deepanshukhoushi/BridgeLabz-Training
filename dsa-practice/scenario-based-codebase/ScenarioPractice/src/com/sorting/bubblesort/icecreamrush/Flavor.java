package com.sorting.bubblesort.icecreamrush;

public class Flavor {

    private String name;
    private int sales;

    public Flavor(String name, int sales) {
        this.name = name;
        this.sales = sales;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public String toString() {
        return name + " → " + sales;
    }
}
