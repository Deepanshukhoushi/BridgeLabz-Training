package com.objectmodeling.companymanagement;

class Department {
    private String name;
    private String manager;

    // Constructor
    public Department(String name, String manager) {
        this.name = name;
        this.manager = manager;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public void displayInfo() {
        System.out.println("Department: " + name + ", Manager: " + manager);
    }
}
