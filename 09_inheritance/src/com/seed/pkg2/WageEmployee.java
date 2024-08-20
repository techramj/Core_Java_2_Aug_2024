package com.seed.pkg2;

import com.seed.pkg1.Employee;

public class WageEmployee extends Employee{
	
	private int hours;
	private double rate;
	
	public WageEmployee() {
		//id = 1;
		//name = "jack";
		//salary = 4000;  //bcz salary has default specifier
		System.out.println("we default constructor called");
	}
	
	public WageEmployee(int id, String name, double salary,int hours, double rate) {
		super(id,name,salary);
		System.out.println("parameterized WE constructor called");
		this.hours = hours;
		this.rate = rate;
	}
	
	public String toString() {
		return "id: "+getId()+"  name: "+getName()+ "   salary:"+getSalary()+"   no of hours worked: "+hours+"   rate: "+rate;
	}
	
	public double calculateWages() { //Specialization
		return hours*rate;
	}
	
	public double calculateNetSalary() {
		return super.calculateNetSalary() + hours *rate;
	}

}
