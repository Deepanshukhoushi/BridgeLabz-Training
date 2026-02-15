package com.jdbc.crudapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBUtil {

    private static final String URL =
            "jdbc:mysql://localhost:3306/employee_db";

    private static final String USER = "root";
    private static final String PASSWORD = "Deepanshu";

    private DBUtil() {
        // private constructor prevents object creation
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
