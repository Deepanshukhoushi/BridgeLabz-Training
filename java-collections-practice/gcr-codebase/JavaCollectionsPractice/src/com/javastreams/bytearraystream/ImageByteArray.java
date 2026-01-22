package com.javastreams.bytearraystream;

import java.io.*;
import java.util.Scanner;

public class ImageByteArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source image path: ");
        String sourceImagePath = scanner.nextLine();

        System.out.print("Enter destination image path: ");
        String destinationImagePath = scanner.nextLine();

        try {
            FileInputStream fis = new FileInputStream(sourceImagePath);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesRead);
            }

            byte[] imageBytes = baos.toByteArray();

            fis.close();
            baos.close();

            ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
            FileOutputStream fos = new FileOutputStream(destinationImagePath);

            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            bais.close();
            fos.close();

            System.out.println("\nImage successfully converted to byte array and restored.");

        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        scanner.close();
    }
}
