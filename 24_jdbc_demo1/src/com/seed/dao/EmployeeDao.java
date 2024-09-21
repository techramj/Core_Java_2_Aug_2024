package com.seed.dao;

import java.util.List;

import com.seed.entity.Employee;

public interface EmployeeDao {
	
	String ADD_EMP = "insert into emp(id,name,salary)  values (?,?, ?)";
	String UPDATE_EMP = "update emp set name =?, salary =? where id =?";
	String DELETE_EMP = "delete from emp where id =?";
	String FIND_ALL_EMP = "select * from emp";
	String FIND_EMP_BY_ID ="select * from emp where id =?";
	String FIND_EMP_BY_NAME = "select * from emp where name = ?";
	
	void addEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(int id);
	
	List<Employee> findAll();
	
    Employee findById(int id);
	
	public List<Employee> findByName(String name);

}
