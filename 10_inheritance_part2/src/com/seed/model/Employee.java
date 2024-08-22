package com.seed.model;

import java.util.Objects;

public class Employee { // by default extends Object

	public int id;
	protected String name;
	double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	  public int getId() { return id; }
	  
	  public void setId(int id) { this.id = id; }
	  
	  public String getName() { return name; }
	  
	  public void setName(String name) { this.name = name; }
	  
	  public double getSalary() { return salary; }
	  
	  public void setSalary(double salary) { this.salary = salary; }
	  

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public double calculateNetSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id,name,salary);
	}

	
	public final void display() {
		System.out.println("Details of Object: "+this.getClass().getSimpleName());
		System.out.println("-----------------------------------");
		System.out.println(this);
		System.out.println();
	}

	

}