package com.hashmapsandhashfunctions.customhashmap;

import java.util.LinkedList;

class CustomHashmap<K, V> {

    // Entry node
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity;
    private LinkedList<Entry<K, V>>[] buckets;

    // Constructor
    @SuppressWarnings("unchecked")
    public CustomHashmap(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
    }

    // Hash function
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    // Insert / Update
    public void put(K key, V value) {
        int index = getIndex(key);

        if (buckets[index] == null) {
            buckets[index] = new LinkedList<>();
        }

        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value; // update
                return;
            }
        }

        buckets[index].add(new Entry<>(key, value));
    }

    // Retrieve
    public V get(K key) {
        int index = getIndex(key);

        if (buckets[index] != null) {
            for (Entry<K, V> entry : buckets[index]) {
                if (entry.key.equals(key)) {
                    return entry.value;
                }
            }
        }
        return null;
    }

    // Delete
    public void remove(K key) {
        int index = getIndex(key);

        if (buckets[index] != null) {
            buckets[index].removeIf(entry -> entry.key.equals(key));
        }
    }
}
