package com.javastreams.bufferedstreams;
import java.io.*;
import java.util.Scanner;

public class BufferedVsUnbufferedCopy {
    private static final int BUFFER_SIZE = 4096;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Enter destination path for unbuffered copy: ");
        String unbufferedDest = scanner.nextLine();

        System.out.print("Enter destination path for buffered copy: ");
        String bufferedDest = scanner.nextLine();

        copyUsingUnbufferedStreams(sourcePath, unbufferedDest);
        copyUsingBufferedStreams(sourcePath, bufferedDest);

        scanner.close();
    }

        private static void copyUsingUnbufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("\nUnbuffered Copy Time: " + (endTime - startTime) / 1000000 + " ms");

        } catch (IOException e) {
            System.out.println("Error during unbuffered copy: " + e.getMessage());
        }
    }

    private static void copyUsingBufferedStreams(String source, String dest) {
        long startTime = System.nanoTime();

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[BUFFER_SIZE];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }

            long endTime = System.nanoTime();
            System.out.println("Buffered Copy Time:   " + (endTime - startTime) / 1000000 + " ms");

        } catch (IOException e) {
            System.out.println("Error during buffered copy: " + e.getMessage());
        }
    }
}
