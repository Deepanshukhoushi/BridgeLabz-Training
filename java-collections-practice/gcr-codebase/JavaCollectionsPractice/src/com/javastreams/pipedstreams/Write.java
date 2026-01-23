package com.javastreams.pipedstreams;

import java.io.IOException;
import java.io.PipedOutputStream;

class Writer implements Runnable {

    private PipedOutputStream pos;

    public Writer(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Hello from Writer Thread";

            pos.write(message.getBytes());
            pos.close();

        } catch (IOException e) {
            System.out.println("Writer Error: " + e.getMessage());
        }
    }
}