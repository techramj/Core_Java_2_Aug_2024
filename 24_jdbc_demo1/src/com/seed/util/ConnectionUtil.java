package com.seed.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	private static Connection connection;
	
	static {
		try (FileInputStream fis = new FileInputStream("application.properties")){
			
			Properties prop = new Properties();
			prop.load(fis);
			
			String driverName = prop.getProperty("db.driverClassName"); //mysql driver
			String url = prop.getProperty("db.url");
			String username = prop.getProperty("db.username");
			String password = prop.getProperty("db.password");
			
			Class.forName(driverName);
			System.out.println("driver loaded successfully");
			
			connection = DriverManager.getConnection(url, username, password);
			System.out.println(connection);
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
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
