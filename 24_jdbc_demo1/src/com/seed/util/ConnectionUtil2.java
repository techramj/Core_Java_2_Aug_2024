package com.seed.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil2 {
	private static Connection connection;
	
	static {
		String driverName = "com.mysql.cj.jdbc.Driver"; //mysql driver
		String url = "jdbc:mysql://localhost:3306/hr";
		String username = "root";
		String password = "rootroot";
		
		try {
			Class.forName(driverName);
			System.out.println("driver loaded successfully");
			
			connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {	
		return connection;
	}

	public void closeConnection() {

		try {
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
