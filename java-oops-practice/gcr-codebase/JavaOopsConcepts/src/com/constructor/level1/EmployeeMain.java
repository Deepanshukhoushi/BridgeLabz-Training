package com.constructor.level1;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp =
                new Employee(101, "IT", 45000.00);
        emp.displayEmployeeDetails();

        // Modify salary using public method
        emp.setSalary(50000.00);
        System.out.println("Updated Salary: ₹" + emp.getSalary());
        System.out.println();

        Manager mgr =
                new Manager(201, "HR", 75000.00, "Team Lead");
        mgr.displayManagerDetails();
    }
}
