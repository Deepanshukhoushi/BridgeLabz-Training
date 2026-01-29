package com.methodreference.nameuppercasing;

import java.util.*;

public class EmployeeNameUppercase {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> employeeNames = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter employee names:");
        for (int i = 0; i < n; i++) {
            employeeNames.add(sc.nextLine());
        }

        System.out.println("\nEmployee Names in Uppercase (HR Letter):");

        employeeNames.stream()
                     .map(String::toUpperCase)
                     .forEach(System.out::println);

        sc.close();
    }
}
