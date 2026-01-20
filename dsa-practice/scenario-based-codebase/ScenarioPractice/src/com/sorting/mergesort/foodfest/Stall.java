package com.sorting.mergesort.foodfest;
public class Stall {
    private String stallName;
    private int footfall;

    public Stall(String stallName, int footfall) {
        this.stallName = stallName;
        this.footfall = footfall;
    }

    public int getFootfall() {
        return footfall;
    }

    public String getStallName() {
        return stallName;
    }

    @Override
    public String toString() {
        return stallName + " -> " + footfall;
    }
}
