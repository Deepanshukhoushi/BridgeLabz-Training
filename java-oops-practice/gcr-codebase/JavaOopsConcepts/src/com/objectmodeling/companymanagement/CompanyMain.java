package com.objectmodeling.companymanagement;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company("Tech Innovations");

        Department itDepartment = new Department("IT", "Alice Johnson");
        Department hrDepartment = new Department("HR", "Bob Smith");

        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        company.displayCompanyInfo();
    }
}