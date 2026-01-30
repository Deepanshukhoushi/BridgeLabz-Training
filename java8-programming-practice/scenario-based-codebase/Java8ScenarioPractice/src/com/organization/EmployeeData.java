package com.organization;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {

        return Arrays.asList(
            new Employee(1, "Amit", 25, "Male", "Sales", 2018, 30000),
            new Employee(2, "Neha", 28, "Female", "HR", 2016, 35000),
            new Employee(3, "Rahul", 30, "Male", "IT", 2014, 50000),
            new Employee(4, "Sneha", 26, "Female", "Sales", 2019, 28000),
            new Employee(5, "Vikram", 35, "Male", "Product Development", 2012, 70000)
        );
    }
}
