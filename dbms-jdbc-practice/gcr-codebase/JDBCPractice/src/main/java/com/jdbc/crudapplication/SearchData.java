package com.jdbc.crudapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SearchData {
	public static void searchEmployeeByName(String name) {

	    String sql = "SELECT * FROM employee WHERE name LIKE ?";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql)) {

	        ps.setString(1, "%" + name + "%");

	        ResultSet rs = ps.executeQuery();

	        boolean found = false;

	        while (rs.next()) {
	            found = true;

	            System.out.println(
	                    rs.getInt("id") + " | " +
	                    rs.getString("name") + " | " +
	                    rs.getString("email") + " | " +
	                    rs.getObject("age") + " | " +
	                    rs.getObject("salary") + " | " +
	                    rs.getString("department")
	            );
	        }

	        if (!found)
	            System.out.println("No employee found!");

	    } catch (SQLException e) {
	        System.out.println("Error searching employee");
	    }
	}

}
