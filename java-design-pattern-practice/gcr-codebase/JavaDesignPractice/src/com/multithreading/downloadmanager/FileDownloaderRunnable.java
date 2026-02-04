package com.multithreading.downloadmanager;

import java.util.Random;

class FileDownloaderRunnable implements Runnable {

    private final String fileName;
    private final Random random = new Random();

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        try {
            for (int progress = 0; progress <= 100; progress += 10) {
                System.out.println("[" + Thread.currentThread().getName() + 
                                   "] Downloading " + fileName + ": " + progress + "%");
                Thread.sleep(200 + random.nextInt(300)); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


