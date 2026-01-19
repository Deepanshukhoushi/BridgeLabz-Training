package com.interfaces.mapinterface.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GroupByDepartment {
    public static Map<String, List<Employee>> groupEmployeesByDepartment(List<Employee> employees) {

        Map<String, List<Employee>> departmentMap = new HashMap<>();

        for (Employee emp : employees) {
            departmentMap
                .computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                .add(emp);
        }

        return departmentMap;
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        
        System.out.println("Enter no. of Employees: ");
        int size = input.nextInt();
        for(int i = 0; i<size; i++) {
        	System.out.println("Enter Employee name and Department: ");
        	String name = input.next();
        	String dept = input.next();
        	employees.add(new Employee(name, dept));
        }

        Map<String, List<Employee>> result =
                groupEmployeesByDepartment(employees);

        System.out.println(result);
        input.close();
    }
}