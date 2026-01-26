package com.medinventory;

import java.time.LocalDate;

public class Item<T> {

    private String itemId;
    private T itemName;
    private int quantity;
    private LocalDate expiryDate;

    public Item(String itemId, T itemName, int quantity, LocalDate expiryDate) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public String getItemId() {
        return itemId;
    }

    public T getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return itemId.equals(item.itemId);
    }

    @Override
    public int hashCode() {
        return itemId.hashCode();
    }

    @Override
    public String toString() {
        return itemId + " - " + itemName +
               " | Qty: " + quantity +
               " | Expiry: " + expiryDate;
    }
}
