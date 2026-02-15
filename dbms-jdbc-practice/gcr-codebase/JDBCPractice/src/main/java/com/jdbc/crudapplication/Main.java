package com.jdbc.crudapplication;

import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final AddEmployee dao = new AddEmployee();

    public static void main(String[] args) {

        while (true) {

            printMenu();
            int choice = getIntInput("Enter choice: ");

            switch (choice) {

                case 1:
                    addEmployee();
                    break;

                case 2:
                    viewAllEmployees();
                    break;

                case 3:
                    updateSalary();
                    break;

                case 4:
                    deleteEmployee();
                    break;

                case 5:
                    searchByName();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== Employee Management System =====");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Update Salary");
        System.out.println("4. Delete Employee");
        System.out.println("5. Search Employee by Name");
        System.out.println("6. Exit");
    }

    private static void addEmployee() {

        scanner.nextLine(); // clear buffer

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Integer age = getOptionalInt("Enter age (or press enter to skip): ");
        Integer salary = getOptionalInt("Enter salary (or press enter to skip): ");

        System.out.print("Enter department (or press enter to skip): ");
        String department = scanner.nextLine();
        if (department.isEmpty()) {
            department = null;
        }

        Employee employee = new Employee(name, email, age, salary, department);
        dao.addEmployee(employee);
    }

    private static void viewAllEmployees() {

        List<Employee> list = RetriveEmployeeData.getAllEmployees();

        if (list.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        for (Employee emp : list) {
            System.out.println(
                    emp.getId() + " | " +
                    emp.getName() + " | " +
                    emp.getEmail() + " | " +
                    emp.getAge() + " | " +
                    emp.getSalary() + " | " +
                    emp.getDepartment()
            );
        }
    }

    private static void updateSalary() {

        int id = getIntInput("Enter employee ID: ");
        int salary = getIntInput("Enter new salary: ");

        UpdateData.updateSalary(id, salary);
    }

    private static void deleteEmployee() {

        int id = getIntInput("Enter employee ID to delete: ");
        DeleteData.deleteEmployee(id);
    }

    private static void searchByName() {

        scanner.nextLine();
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();

        SearchData.searchEmployeeByName(name);
    }

    private static int getIntInput(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    private static Integer getOptionalInt(String message) {
        System.out.print(message);
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            return null;
        }
        return Integer.parseInt(input);
    }
}
