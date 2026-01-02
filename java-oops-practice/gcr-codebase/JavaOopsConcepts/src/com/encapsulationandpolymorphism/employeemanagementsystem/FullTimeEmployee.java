package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; 
    }
}