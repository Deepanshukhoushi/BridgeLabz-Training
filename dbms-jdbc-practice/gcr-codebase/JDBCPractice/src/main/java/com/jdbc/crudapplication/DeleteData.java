package com.jdbc.crudapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public static void deleteEmployee(int id) {

	    String sql = "DELETE FROM employee WHERE id = ?";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setInt(1, id);

	        int rows = ps.executeUpdate();

	        if (rows > 0)
	            System.out.println("Employee deleted!");
	        else
	            System.out.println("Employee not found!");

	    } catch (SQLException e) {
	        System.out.println("Error deleting employee");
	    }
	}
}
