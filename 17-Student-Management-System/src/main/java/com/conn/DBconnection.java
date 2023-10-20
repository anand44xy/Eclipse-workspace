package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	// Define a private static Connection instance.
	private static Connection conn = null;

	// Method to get a database connection.
	public static Connection getConnection() {
		try {
			// Check if the connection has already been established.
			if (conn == null || conn.isClosed()) {
				// Load the MySQL JDBC driver.
				Class.forName("com.mysql.cj.jdbc.Driver");

				// Establish a new database connection.
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "Anand", "8550");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			// Handle the ClassNotFoundException, typically by logging or rethrowing.
		} catch (SQLException e) {
			e.printStackTrace();
			// Handle the SQLException, typically by logging or rethrowing.
		}

		return conn;
	}
}
