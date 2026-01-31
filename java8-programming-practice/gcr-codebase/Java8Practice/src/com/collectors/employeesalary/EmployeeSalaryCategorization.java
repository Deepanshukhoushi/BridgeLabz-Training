package com.collectors.employeesalary;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSalaryCategorization {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", "IT", 60000),
            new Employee("Anita", "HR", 45000),
            new Employee("Suresh", "IT", 75000),
            new Employee("Meena", "Finance", 80000),
            new Employee("Kiran", "HR", 55000)
        );

        Map<String, Double> avgSalaryByDept =
                employees.stream()
                         .collect(Collectors.groupingBy(
                             Employee::getDepartment,
                             Collectors.averagingDouble(Employee::getSalary)
                         ));

        System.out.println("Average Salary by Department:");
        avgSalaryByDept.forEach(
            (dept, avgSalary) ->
                System.out.println(dept + " : " + avgSalary)
        );
    }
}
