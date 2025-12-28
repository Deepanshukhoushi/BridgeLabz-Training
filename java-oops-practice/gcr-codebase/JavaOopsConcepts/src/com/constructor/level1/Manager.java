package com.constructor.level1;

public class Manager extends Employee {

    private String role;

    public Manager(int employeeID, String department,
                   double salary, String role) {
        super(employeeID, department, salary);
        this.role = role;
    }

    // Accessing public & protected members
    public void displayManagerDetails() {
        System.out.println("Employee ID : " + employeeID);   // public
        System.out.println("Department  : " + department);   // protected
        System.out.println("Salary      : ₹" + getSalary());
        System.out.println("Role        : " + role);
        System.out.println();
    }
}
