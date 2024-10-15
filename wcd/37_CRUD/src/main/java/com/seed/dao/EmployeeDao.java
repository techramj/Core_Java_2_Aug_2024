package com.seed.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.seed.entity.Employee;
import com.seed.util.ConnectionUtil;

public class EmployeeDao {
	
	private Connection connection = ConnectionUtil.getConnection();
	
	
	public void addEmployee(Employee emp) {
		int id = getMaxId() +1 ;
		String sql="insert into emp(id,name,salary) values (?,?,?)";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(1, id);
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			int x=ps.executeUpdate();
			System.out.println(x+"row inserted!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateEmployee(Employee emp) {
		String sql="update emp set name= ?, salary=? where id=?";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(3, emp.getId());
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			int x=ps.executeUpdate();
			System.out.println(x+" row updated!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
		String sql="delete  from emp where id=?";
		try(PreparedStatement ps = connection.prepareStatement(sql)){
			ps.setInt(1, id);
			int x=ps.executeUpdate();
			System.out.println(x+" row deleted!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<Employee>();
		String sql="select id,name,salary from emp";
		try(Statement st=connection.createStatement()){
			try(ResultSet rs= st.executeQuery(sql);){
				while(rs.next()) {
					list.add(populateEmp(rs));
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public Employee getEmployeeById(int id) {
		Employee emp=null;
		String sql="select id,name,salary from emp where id=?";
		try(PreparedStatement ps=connection.prepareStatement(sql)){
			ps.setInt(1, id);
			try(ResultSet rs= ps.executeQuery();){
				while(rs.next()) {
					emp=populateEmp(rs);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}
	
	public List<Employee> getEmployeeByName(String name) {
		List<Employee> list = new ArrayList<Employee>();
		String sql="select id,name,salary from emp where id=?";
		try(PreparedStatement ps=connection.prepareStatement(sql)){
			ps.setString(1, name);
			try(ResultSet rs= ps.executeQuery();){
				while(rs.next()) {
					list.add(populateEmp(rs));
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public int getMaxId() {
		Employee emp=null;
		String sql="select max(id) from emp";
		try(PreparedStatement ps=connection.prepareStatement(sql)){
			try(ResultSet rs= ps.executeQuery();){
				if(rs.next()) {
					return rs.getInt(1);
				}
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	
	
	
	private Employee populateEmp(ResultSet rs) throws SQLException {
		Employee emp = new Employee();
		emp.setId(rs.getInt(1));
		emp.setName(rs.getString(2));
		emp.setSalary(rs.getDouble(3));
		return emp;
	}

}
