package com.javagenerics.smartwarehousemanagementsystem;
abstract class WarehouseItem {
    protected String name;
    protected double price;

    public WarehouseItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract String getCategory();

    @Override
    public String toString() {
        return getCategory() + " [Name=" + name + ", Price=" + price + "]";
    }
}
