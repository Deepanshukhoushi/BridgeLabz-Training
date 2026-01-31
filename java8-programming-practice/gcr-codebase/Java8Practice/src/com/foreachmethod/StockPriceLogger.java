package com.foreachmethod;

import java.util.*;

public class StockPriceLogger {
    public static void main(String[] args) {

        List<Double> stockPrices = Arrays.asList(
            1025.50, 1030.75, 1018.20, 1045.60, 1038.90
        );

        System.out.println("Live Stock Price Updates:");

        stockPrices.forEach(price ->
                System.out.println("Stock Price: ₹" + price)
        );
    }
}
