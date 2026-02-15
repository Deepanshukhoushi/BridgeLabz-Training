package com.jdbc.crudapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Types;

public class AddEmployee {
	public void addEmployee(Employee employee) {

	    String sql = "INSERT INTO employee (name, email, age, salary, department) VALUES (?, ?, ?, ?, ?)";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, employee.getName());
	        ps.setString(2, employee.getEmail());

	        if (employee.getAge() != null)
	            ps.setInt(3, employee.getAge());
	        else
	            ps.setNull(3, Types.INTEGER);

	        if (employee.getSalary() != null)
	            ps.setInt(4, employee.getSalary());
	        else
	            ps.setNull(4, Types.INTEGER);

	        ps.setString(5, employee.getDepartment());

	        ps.executeUpdate();
	        System.out.println("Employee added successfully!");

	    } catch (SQLIntegrityConstraintViolationException e) {
	        System.out.println("Email already exists!");
	    } catch (SQLException e) {
	        System.out.println("Error: " + e.getMessage());
	    }
	}

}
