package com.seed.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
	
	private static Connection connection;
	
	public static Connection getConnection(String driver, String url, String username, String password) {
		if(connection == null) {
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, username, password);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return connection;
	}

}
