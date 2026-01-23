package com.javastreams.pipedstreams;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {
    public static void main(String[] args) {

        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            Thread writerThread = new Thread(new Writer(pos));

            Thread readerThread = new Thread(new Reader(pis));

            writerThread.start();
            readerThread.start();

        } catch (IOException e) {
            System.out.println("Pipe connection error: " + e.getMessage());
        }
    }
}


