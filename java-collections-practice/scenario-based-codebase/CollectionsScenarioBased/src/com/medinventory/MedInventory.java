package com.medinventory;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class MedInventory {

    private static final String DATE_REGEX =
            "\\d{2}-\\d{2}-\\d{4}";

    private static final int LOW_STOCK_LIMIT = 10;

    public static void main(String[] args) {

        Map<String, List<Item<String>>> categoryMap = new HashMap<>();
        Set<Item<String>> inventorySet = new HashSet<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try (BufferedReader br =
                     new BufferedReader(new FileReader("inventory.csv"))) {

            String line;
            br.readLine(); // skip header

            while ((line = br.readLine()) != null) {

                try {
                    String[] parts = line.split(",");

                    if (parts.length != 4) {
                        throw new IllegalArgumentException("Invalid CSV format");
                    }

                    String itemId = parts[0];
                    String itemName = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    String expiryStr = parts[3];

                    if (!Pattern.matches(DATE_REGEX, expiryStr)) {
                        throw new IllegalArgumentException("Invalid date format");
                    }

                    LocalDate expiryDate =
                            LocalDate.parse(expiryStr, formatter);

                    Item<String> item =
                            new Item<>(itemId, itemName, quantity, expiryDate);

                    inventorySet.add(item);

                    // Categorize by item name
                    categoryMap
                            .computeIfAbsent(itemName, k -> new ArrayList<>())
                            .add(item);

                    // Expiry check
                    if (expiryDate.isBefore(LocalDate.now())) {
                        System.out.println("EXPIRED: " + item);
                    }

                    // Low stock alert
                    if (quantity < LOW_STOCK_LIMIT) {
                        throw new LowStockException(
                                "Low stock for " + itemName + ": " + quantity);
                    }

                } catch (LowStockException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File read error");
        }

        displaySummary(categoryMap, inventorySet);
    }

    private static void displaySummary(
            Map<String, List<Item<String>>> map,
            Set<Item<String>> set) {

        System.out.println("\nInventory Summary");
        map.forEach((category, items) -> {
            System.out.println("\n" + category + ":");
            items.forEach(System.out::println);
        });

        System.out.println("\nTotal Unique Items: " + set.size());
    }
}
