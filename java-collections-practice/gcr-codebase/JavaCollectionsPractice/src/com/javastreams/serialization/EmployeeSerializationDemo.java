package com.javastreams.serialization;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSerializationDemo {

    @SuppressWarnings("unchecked")
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Department: ");
            String dept = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();

            employeeList.add(new Employee(id, name, dept, salary));
        }

        System.out.print("\nEnter file path to store employee data: ");
        String filePath = scanner.nextLine();

        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(filePath))) {

            oos.writeObject(employeeList);
            System.out.println("\nEmployee data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error during serialization: " + e.getMessage());
        }

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(filePath))) {

            List<Employee> retrievedList =
                    (List<Employee>) ois.readObject();

            System.out.println("\nRetrieved Employee Data:");
            for (Employee emp : retrievedList) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("IO Error during deserialization: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }

        scanner.close();
    }
}
