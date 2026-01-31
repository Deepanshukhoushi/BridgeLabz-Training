package com.functionalinterface.functionalinterfaces.backgroundjobexecution;

public class BackgroundJobExecution {
    public static void main(String[] args) {

        Runnable backgroundTask = () -> {
            System.out.println("Background task started...");
            try {
                Thread.sleep(20000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Background task completed!");
        };

        Thread backgroundThread = new Thread(backgroundTask);
        backgroundThread.start();

        System.out.println("Main thread continues executing...");
    }
}