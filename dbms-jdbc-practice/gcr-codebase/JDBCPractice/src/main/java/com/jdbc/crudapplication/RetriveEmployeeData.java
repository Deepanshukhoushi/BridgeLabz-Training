package com.jdbc.crudapplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RetriveEmployeeData {
	public static List<Employee> getAllEmployees() {

	    List<Employee> list = new ArrayList<>();
	    String sql = "SELECT * FROM employee";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement ps = conn.prepareStatement(sql);
	         ResultSet rs = ps.executeQuery()) {

	        while (rs.next()) {

	            Employee emp = new Employee(
	                    rs.getInt("id"),
	                    rs.getString("name"),
	                    rs.getString("email"),
	                    (Integer) rs.getObject("age"),
	                    (Integer) rs.getObject("salary"),
	                    rs.getString("department")
	            );

	            list.add(emp);
	        }

	    } catch (SQLException e) {
	        System.out.println("Error fetching data");
	    }

	    return list;
	}

}
