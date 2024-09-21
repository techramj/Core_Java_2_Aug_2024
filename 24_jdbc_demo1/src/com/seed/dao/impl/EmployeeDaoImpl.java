package com.seed.dao.impl;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;
import com.seed.util.ConnectionUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmployee(Employee emp) {
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(ADD_EMP)){
			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSalary());
			int x = ps.executeUpdate();
			System.out.println(x+" row added");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateEmployee(Employee emp) {
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(UPDATE_EMP)){
			ps.setInt(3, emp.getId());
			ps.setString(1, emp.getName());
			ps.setDouble(2, emp.getSalary());
			int x = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteEmployee(int id) {
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(DELETE_EMP)){
			ps.setInt(1, id);
			int x = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employees = new ArrayList<Employee>();
		try(Statement st = ConnectionUtil.getConnection().createStatement()){
			try(ResultSet rs = st.executeQuery(FIND_ALL_EMP)){
				while(rs.next()) {
					int id = rs.getInt("id");
					String name = rs.getString("name");
					double salary = rs.getDouble("salary");
					Employee emp = new Employee(id, name, salary);
					employees.add(emp);
				}
			}	
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public Employee findById(int id) {
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(FIND_EMP_BY_ID)){
			ps.setInt(1, id);
			try(ResultSet rs = ps.executeQuery()){
				if(rs.next()) {
					int empId = rs.getInt("id");
					String name = rs.getString("name");
					double salary = rs.getDouble("salary");
					return new Employee(id, name, salary);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> employees = new ArrayList<Employee>();
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(FIND_EMP_BY_ID)){
			ps.setString(1, name);
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					int empId = rs.getInt("id");
					String empName = rs.getString("name");
					double salary = rs.getDouble("salary");
					Employee emp = new Employee(empId, empName, salary);
					employees.add(emp);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
