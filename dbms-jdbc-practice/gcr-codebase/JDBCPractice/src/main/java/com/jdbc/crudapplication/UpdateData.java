package com.jdbc.crudapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateData {
	public static void updateSalary(int id, int newSalary) {

	    String sql = "UPDATE employee SET salary = ? WHERE id = ?";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, newSalary);
	        ps.setInt(2, id);

	        int rows = ps.executeUpdate();

	        if (rows > 0)
	            System.out.println("Salary updated successfully!");
	        else
	            System.out.println("Employee not found!");

	    } catch (SQLException e) {
	        System.out.println("Error updating salary");
	    }
	}

}
