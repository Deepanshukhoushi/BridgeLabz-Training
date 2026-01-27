package com.csvhandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class GenerateCSVReport {

    private static final String DB_URL =
            "jdbc:mysql://localhost:3306/companydb";
    private static final String USER = "root";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {

        String csvFile = "employees_report.csv";
        String query =
                "SELECT emp_id, name, department, salary FROM employees";

        try (
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            BufferedWriter writer = new BufferedWriter(new FileWriter(csvFile))
        ) {

            // Header
            writer.write("Employee ID,Name,Department,Salary");
            writer.newLine();

            // Data
            while (rs.next()) {
                writer.write(
                    rs.getInt("emp_id") + "," +
                    rs.getString("name") + "," +
                    rs.getString("department") + "," +
                    rs.getDouble("salary")
                );
                writer.newLine();
            }

            System.out.println("CSV report generated successfully.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
