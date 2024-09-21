package com.seed;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import java.sql.DatabaseMetaData;
import com.seed.dao.EmployeeDao;
import com.seed.dao.impl.EmployeeDaoImpl;
import com.seed.entity.Employee;
import com.seed.util.ConnectionUtil;

public class ConnectionDemo2 {
	
	public static void main(String[] args) {
		
		EmployeeDao empDao = new EmployeeDaoImpl();
		//empDao.addEmployee(new Employee(10,"Jack",9999));
		
		displayDbInfo();
		displayTableDetails("students");
		
	}
	
	
	public static void displayDbInfo() {
		try {
			DatabaseMetaData  dbmd = ConnectionUtil.getConnection().getMetaData();
			System.out.println("productName: "+dbmd.getDatabaseProductName());
			System.out.println("driver version: "+ dbmd.getDriverVersion());
			int x = dbmd.getMaxColumnNameLength();
			int maxColumnInSelct = dbmd.getMaxColumnsInSelect();
			System.out.println(maxColumnInSelct);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	//information of the table
	public static void displayTableDetails(String tableName) {
		String sql = "select * from "+tableName;
		
		try(Statement st = ConnectionUtil.getConnection().createStatement()){
			try(ResultSet rs = st.executeQuery(sql)){
				ResultSetMetaData rsmd = rs.getMetaData();
				int colCount = rsmd.getColumnCount();
				for(int i=1 ;i<= colCount ; i++) {
					System.out.print(rsmd.getColumnName(i)+"  ");
					System.out.println(rsmd.getColumnTypeName(i));
				}
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

}
