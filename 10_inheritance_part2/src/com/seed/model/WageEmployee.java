package com.seed.model;


public class WageEmployee extends Employee{
	
	private int hours;
	private double rate;
	
	public WageEmployee() {
	}
	
	public WageEmployee(int id, String name, double salary,int hours, double rate) {
		super(id,name,salary);
		this.hours = hours;
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "id: "+getId()+"  name: "+getName()+ "   salary:"+getSalary()+"   no of hours worked: "+hours+"   rate: "+rate;
	}
	
	//specific method
	public double getVariable() { //Specialization
		return hours*rate;
	}
	
	@Override
	public double calculateNetSalary() {
		return super.calculateNetSalary() + hours *rate;
	}
}
