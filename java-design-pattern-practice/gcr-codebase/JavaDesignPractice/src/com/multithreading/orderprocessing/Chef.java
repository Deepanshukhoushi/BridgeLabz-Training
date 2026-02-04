package com.multithreading.orderprocessing;

class Chef extends Thread {

    private final String dish;
    private final int totalTimeMillis;

    public Chef(String name, String dish, int totalTimeMillis) {
        super(name); 
        this.dish = dish;
        this.totalTimeMillis = totalTimeMillis;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dish);

        try {
            int stepTime = totalTimeMillis / 4;

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dish + ": 25% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dish + ": 50% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dish + ": 75% complete");

            Thread.sleep(stepTime);
            System.out.println(getName() + " preparing " + dish + ": 100% complete");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
