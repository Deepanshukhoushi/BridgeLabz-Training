package com.encapsulationandpolymorphism.employeemanagementsystem;

public abstract class Employee implements Department {

    private int employeeId;
    private String name;
    protected double baseSalary;
    private String department;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters & Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + calculateSalary());
        System.out.println("----------------------------------");
    }
}
