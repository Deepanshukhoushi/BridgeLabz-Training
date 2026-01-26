package com.annotationsandreflection.annotations.customcatchingsystem;

public class Main {
    public static void main(String[] args) throws Exception {

        MathService service = new MathService();

        long start = System.currentTimeMillis();
        System.out.println("Result: " +
                CacheExecutor.execute(service, "slowSquare", 5));
        System.out.println("Time taken: " +
                (System.currentTimeMillis() - start) + " ms");

        System.out.println();

        start = System.currentTimeMillis();
        System.out.println("Result: " +
                CacheExecutor.execute(service, "slowSquare", 5));
        System.out.println("Time taken: " +
                (System.currentTimeMillis() - start) + " ms");
    }
}
