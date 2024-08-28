package com.seed.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private WeekDay sprintDay;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary, WeekDay sprintDay) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.sprintDay = sprintDay;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", sprintDay=" + sprintDay + "]";
	}
	
	

}
