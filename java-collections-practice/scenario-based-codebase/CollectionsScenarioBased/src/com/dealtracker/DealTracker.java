package com.dealtracker;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.*;

public class DealTracker {

    private static final Pattern CODE_PATTERN =
            Pattern.compile("DealCode:\\s*(\\w+)");
    private static final Pattern DATE_PATTERN =
            Pattern.compile("ValidTill:\\s*(\\d{2}-\\d{2}-\\d{4})");
    private static final Pattern DISCOUNT_PATTERN =
            Pattern.compile("Discount:\\s*(\\d+)%");
    private static final Pattern MIN_PURCHASE_PATTERN =
            Pattern.compile("MinimumPurchase:\\s*(\\d+)");

    public static void main(String[] args) {

        File folder = new File("deals");
        Map<String, Deal> dealMap = new HashMap<>();
        Set<String> dealCodes = new HashSet<>();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (File file : folder.listFiles()) {
            if (!file.getName().endsWith(".txt")) continue;

            try {
                Deal deal = readDeal(file, formatter);

                // Duplicate check
                if (!dealCodes.add(deal.getCode())) {
                    System.out.println("Duplicate deal skipped: "
                            + deal.getCode());
                    continue;
                }

                // Expiry check
                if (deal.getValidTill().isBefore(LocalDate.now())) {
                    System.out.println("Expired deal skipped: "
                            + deal.getCode());
                    continue;
                }

                dealMap.put(deal.getCode(), deal);

            } catch (Exception e) {
                System.out.println("Invalid deal file skipped: "
                        + file.getName());
            }
        }

        // Sort deals by discount
        List<Deal> sortedDeals =
                new ArrayList<>(dealMap.values());

        sortedDeals.sort(
                Comparator.comparingInt(Deal::getDiscount).reversed()
        );

        displayDeals(sortedDeals);
    }

    private static Deal readDeal(File file,
                                 DateTimeFormatter formatter)
            throws IOException {

        String content;

        try (FileInputStream fis =
                     new FileInputStream(file)) {

            content = new String(fis.readAllBytes());
        }

        String code = extract(content, CODE_PATTERN);
        String dateStr = extract(content, DATE_PATTERN);
        String discountStr = extract(content, DISCOUNT_PATTERN);
        String minPurchaseStr =
                extract(content, MIN_PURCHASE_PATTERN);

        LocalDate validTill =
                LocalDate.parse(dateStr, formatter);

        return new Deal(
                code,
                validTill,
                Integer.parseInt(discountStr),
                Integer.parseInt(minPurchaseStr)
        );
    }

    private static String extract(String text, Pattern pattern) {
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        throw new IllegalArgumentException("Missing field");
    }

    private static void displayDeals(List<Deal> deals) {

        System.out.println("\nActive Deals (Sorted by Discount)");

        deals.forEach(System.out::println);
    }
}
