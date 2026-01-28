package com.jsondatahandling.dbreport;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenerateJsonReport {
    public static void main(String[] args) {

	String outputFile = "samplefiles/dbreport/employee_report.json";

	List<EmployeeRecord> records = new ArrayList<>();

	try {

	    String url = "jdbc:mysql://localhost:3306/sampledb" + "?useSSL=false" + "&allowPublicKeyRetrieval=true"
		    + "&serverTimezone=UTC";

	    Connection con = DriverManager.getConnection(url, "myUsername", "myPassword");

	    Statement stmt = con.createStatement();
	    ResultSet rs = stmt.executeQuery("SELECT id, name, department, salary FROM employees");

	    while (rs.next()) {

		EmployeeRecord emp = new EmployeeRecord(rs.getInt("id"), rs.getString("name"),
			rs.getString("department"), rs.getDouble("salary"));

		records.add(emp);
	    }

	    rs.close();
	    stmt.close();
	    con.close();

	    ObjectMapper mapper = new ObjectMapper();

	    mapper.writerWithDefaultPrettyPrinter().writeValue(new File(outputFile), records);
	    System.out.println("JSON report generated successfully.");

	} catch (SQLException e) {
	    System.out.println("Database error occurred.");
	    System.out.println(e.getMessage());

	} catch (IOException e) {
	    System.out.println("Error writing JSON file.");
	    System.out.println(e.getMessage());
	}
    }
}