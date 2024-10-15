package com.seed.service;

import java.sql.Connection;
import java.util.List;

import com.seed.dao.EmployeeDao;
import com.seed.entity.Employee;
import com.seed.util.ConnectionUtil;



public class EmployeeService {
	
	EmployeeDao dao= new EmployeeDao();
	

	public List<Employee> getEmployees(){
		return dao.getEmployees();
	}
	
	public void addEmployee(String name,String salary) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(Double.valueOf(salary));
		dao.addEmployee(emp);
	}
	
	public void updateEmployee(String id, String name, String salary) {
		Employee emp = new Employee(Integer.valueOf(id), name, Double.valueOf(salary));
		dao.updateEmployee(emp);
	}
	
	
	public Employee getEmployeeById(String id) {
		Employee employee = null;
		
		if(id == null) {
			employee = new Employee();
		}else {
			employee=dao.getEmployeeById(Integer.parseInt(id));
		}
		return employee;
	}
	
	public void deleteEmployee(String id) {
		dao.deleteEmployee(Integer.parseInt(id));
	}

}
