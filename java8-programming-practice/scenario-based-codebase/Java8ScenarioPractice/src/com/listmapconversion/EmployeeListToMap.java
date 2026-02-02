package com.listmapconversion;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeListToMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no. of Elements: ");
        int n;
        try {
            n = Integer.parseInt(input.nextLine().trim());
            if (n <= 0) {
                System.out.println("Number of elements must be positive.");
                input.close();
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
            input.close();
            return;
        }

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Employee ID: ");
            String id = input.nextLine().trim();

            System.out.print("Enter Employee Name: ");
            String name = input.nextLine().trim();

            list.add(new Employee(id, name));
        }

        Map<String, String> map = list.stream()
                .filter(Objects::nonNull) 
                .collect(Collectors.toMap(
                        Employee::getId,          
                        Employee::getName,        
                        (existing, replacement) -> existing, 
                        LinkedHashMap::new       
                ));

        System.out.println("\nEmployee Map: " + map);

        input.close();
    }
}
