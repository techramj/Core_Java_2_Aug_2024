package com.seed;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;
import com.seed.util.ConnectionUtil;

public class ResultSetDemo {
	
	
	public static void example1() {
		Connection con = ConnectionUtil.getConnection();
		String sql ="select id,name,salary from emp";
		//it is similar to con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY)
		try(Statement st = con.createStatement()){  //resultset is forward only
			ResultSet rs = st.executeQuery(sql);
			rs.next(); //move to the first row
			printRowDetails(rs);
			
			rs.next(); //move to the 2nd row
			printRowDetails(rs);
			
			//rs.previous();  //move to 1st row
			//printRowDetails(rs);
			
			rs.last();   //move to last row
			printRowDetails(rs);
			
			
			
		}catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	public static void example2() {
		Connection con = ConnectionUtil.getConnection();
		String sql ="select id,name,salary from emp";
		try(Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY)){  // scrollable resultset only
			ResultSet rs = st.executeQuery(sql);
			rs.next(); //move to the first row
			printRowDetails(rs);
			
			rs.next(); //move to the 2nd row
			printRowDetails(rs);
			
			rs.previous();  //move to 1st row
			printRowDetails(rs);
			
			rs.last();   //move to last row
			printRowDetails(rs);
			
			
			System.out.println("\nmove to first row");
			rs.first(); //first row
			printRowDetails(rs);
			
			System.out.println("move to next 2");
			rs.relative(2);
			printRowDetails(rs);
			
			
			System.out.println("move to next 2");
			rs.relative(2);
			printRowDetails(rs);
			
			System.out.println("5th row");
			rs.absolute(5);
			printRowDetails(rs);
			
			System.out.println("2nd last row");
			rs.absolute(-2);
			printRowDetails(rs);
			
			
			//reset result set
			rs.beforeFirst();
			
		}catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	
	public static void example3() {
		Connection con = ConnectionUtil.getConnection();
		String sql ="select id,name,salary from emp1";
		try(Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)){  // scrollable resultset only
			ResultSet rs = st.executeQuery(sql);
			
			rs.relative(4);
			printRowDetails(rs);
			
			
			//update the row with salary 25000
			rs.updateDouble(3, 25000);
			rs.updateRow();
			System.out.println("id="+rs.getInt(1)+ " salary updated to 25000");
			
			
			//insert one row
			rs.moveToInsertRow();
			rs.updateInt(1,100);
			rs.updateString(2, "Ajay");
			rs.updateDouble(3, 50000);
			rs.insertRow();
			System.out.println("one row inserted");
			
			rs.first();
			rs.deleteRow();
			System.out.println("frist row deleted");
			
			
		}catch(SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
	
	
	public static void main(String[] args) {
		example3();
		
		try {
			ConnectionUtil.getConnection().close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void printRowDetails(ResultSet rs) throws SQLException{
		int id = rs.getInt(1);
		String name = rs.getString(2);
		double salary = rs.getDouble(3);
		System.out.println("id="+id+"    name="+name+"     salary="+salary);
	}
	
	

}
