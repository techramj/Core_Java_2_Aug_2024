package com.seed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.exceptions.SQLError;

public class ConnectionDemo1 {
	
	public static void main(String[] args) {
		//load the driver
		String driverName = "com.mysql.cj.jdbc.Driver"; //mysql driver
		String url = "jdbc:mysql://localhost:3306/hr";
		String username = "root";
		String password = "rootroot";
		
		try {
			Class.forName(driverName);
			System.out.println("driver loaded successfully");
			
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println(con);
			
			//addDummyEmployee(con);
			//addEmployee1(con, 5, "Sammera", 4000);
			//addEmployee1(con, 6, "Samarth", 4000);
			//addEmployee1(con, 7, "Jessica", 6000);
			
			updateSalary(con,7,20000);
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void updateSalary(Connection con, int id, double newSalary)  {
		String sql ="update emp set salary = ? where id =?";
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(2, id);
			ps.setDouble(1, newSalary);
			int x = ps.executeUpdate();
			System.out.println(x+" row updated..");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addEmployee1(Connection con, int id, String name, double salary)  {
		String sql ="insert into emp(id,name,salary) values (?,?,?)";
		try(PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setDouble(3, salary);
			int x = ps.executeUpdate();
			System.out.println(x+" row inserted..");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void addEmployee(Connection con, int id, String name, double salary)  {
		String sql ="insert into emp(id,name,salary) values ("+id+",'"+name+"',"+salary+")";
		System.out.println(sql);
		try(Statement st = con.createStatement()){
			int x = st.executeUpdate(sql);
			System.out.println(x+" row inserted..");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void addDummyEmployee(Connection con)  {
		String sql ="insert into emp(id,name,salary) values (1,'jack',1000)";
		Statement st = null;
		try{
			st = con.createStatement();
			int x = st.executeUpdate(sql);
			System.out.println(x+" row inserted..");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(st  != null ) {
				try {
					st.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}

}
