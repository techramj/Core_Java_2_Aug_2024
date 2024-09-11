package com.seed;

public class Employee {
	
	public int id;
	protected String name;
	double salary;
	
	static {
		System.out.println("static block called..");
	}
	
	public Employee() {
		System.out.println("Default Emp constructor called");
	}

	public Employee(int id, String name, double salary) {
		System.out.println("paramterized Emp constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display(int a, int b, int c, int d, int e) {}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	@MyAnno1(message ="test")
	@MyAnno2
	public double calculateNetSalary() {
		return salary;
	}
		
}

