package com.seed.general;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salary=" + salary ;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Employee) {
			Employee e = (Employee) obj;
			return this.id == e.id && this.name.equals(e.name)  
					&& Double.compare(this.salary, e.salary) == 0;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id,name,salary);
	}

	@Override
	public int compareTo(Employee o) {
		return this.id - o.id;
		//return this.name.compareTo(o.name);
		//return Double.compare(this.salary, o.salary);
	}

}
