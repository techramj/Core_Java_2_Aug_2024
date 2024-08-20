package com.seed.pkg2;

import com.seed.pkg1.Employee;

public class SalesPerson extends Employee {
	private double salesMade;
	private double commission;
	
	public SalesPerson() {
	}

	public SalesPerson(int id, String name, double salary, double salesMade, double comm) {
		super(id, name, salary);
		this.salesMade = salesMade;
		this.commission = comm;
	}
	
	//get and setter
	
	public double calcualteNetSalary() {
		return super.calculateNetSalary() + salesMade*commission/100;
	}
	
	

}
