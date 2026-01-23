package com.javastreams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

class Reader implements Runnable {

    private PipedInputStream pis;

    public Reader(PipedInputStream pis) {
        this.pis = pis;
    }

    @Override
    public void run() {
        try {
            int data;
            System.out.print("Reader received: ");

            while ((data = pis.read()) != -1) {
                System.out.print((char) data);
            }

            pis.close();

        } catch (IOException e) {
            System.out.println("Reader Error: " + e.getMessage());
        }
    }
}