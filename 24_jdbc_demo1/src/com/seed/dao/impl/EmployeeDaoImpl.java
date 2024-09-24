package com.seed.dao.impl;


import java.sql.Connection;
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

	@Override
	public void addEmployees(List<Employee> employees) {
		long l1 = System.currentTimeMillis();
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(ADD_EMP)){
			for(Employee e: employees) {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setDouble(3, e.getSalary());
				ps.executeUpdate();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println(employees.size()+" rows added");
		long l2 = System.currentTimeMillis();
		long time = l2-l1;
		System.out.println("time taken: "+time+" ms");
		
	}

	@Override
	public void addEmployeesUsingBatch(List<Employee> employees) {
		long l1 = System.currentTimeMillis();
		int exCount = 0;
		try(PreparedStatement ps = ConnectionUtil.getConnection().prepareStatement(ADD_EMP)){
			int count = 0;
			for(Employee e: employees) {
				ps.setInt(1, e.getId());
				ps.setString(2, e.getName());
				ps.setDouble(3, e.getSalary());
				ps.addBatch();
				count++;
				if(count == 100) {
					ps.executeBatch();
					count = 0;
					exCount++;
				}
			}
			if(count!=0) {
				ps.executeBatch();
				exCount++;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		System.out.println(employees.size()+" rows added"+" and not of batch executed: "+exCount);
		long l2 = System.currentTimeMillis();
		long time = l2-l1;
		System.out.println("time taken: "+time+" ms");
		
		
	}
	
	public void transferAmount(int fromId, int toId, double amount) {
		String sql = "update emp set salary = salary + ? where id = ?";
		Connection con = ConnectionUtil.getConnection();
		try(PreparedStatement ps = con.prepareStatement(sql)){
			con.setAutoCommit(false);
			//deduct the amount from fromID
			ps.setDouble(1, -amount);
			ps.setInt(2, fromId);;
			ps.executeUpdate();
			
			if(false) {
				throw new IllegalArgumentException("Connection lost");
			}
			//add the amount to toID
			ps.setDouble(1, amount);
			ps.setInt(2, toId);;
			ps.executeUpdate();
			
			con.commit();
			
			System.out.println(amount+" transfer successfully from "+fromId+" to "+toId);
		}catch(Exception e) {
			//System.out.println("error: "+e.getMessage());
			System.out.println("not able to transfer amount due to "+e.getMessage());
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

}
