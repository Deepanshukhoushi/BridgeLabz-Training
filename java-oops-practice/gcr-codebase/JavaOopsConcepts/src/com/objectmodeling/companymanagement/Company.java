package com.objectmodeling.companymanagement;

import java.util.ArrayList;
import java.util.List;

class Company {
    private String companyName;
    private List<Department> departments; // Composition relationship

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department
    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayCompanyInfo() {
        System.out.println("Company: " + companyName);
        for (Department dept : departments) {
            dept.displayInfo();
        }
    }
}
