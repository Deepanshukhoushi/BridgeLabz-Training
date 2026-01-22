package com.javastreams.datastreams;
import java.io.*;
import java.util.Scanner;

public class StudentDataStream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student roll number: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter file path to store data: ");
        String filePath = scanner.nextLine();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("\nStudent data stored successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing data: " + e.getMessage());
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {

            int storedRollNo = dis.readInt();
            String storedName = dis.readUTF();
            double storedGpa = dis.readDouble();

            System.out.println("\nRetrieved Student Data:");
            System.out.println("Roll Number: " + storedRollNo);
            System.out.println("Name: " + storedName);
            System.out.println("GPA: " + storedGpa);

        } catch (IOException e) {
            System.out.println("Error while reading data: " + e.getMessage());
        }

        scanner.close();
    }
}
