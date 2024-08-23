package com.seed.model;

public class SalesPerson extends Employee {
	private double salesMade;
	private double commission;
	
	public SalesPerson() {
		super();
	}

	public SalesPerson(int id, String name, double salary, double salesMade, double comm) {
		super(id, name, salary);  //super constructor must be the first line
		this.salesMade = salesMade;
		this.commission = comm;
	}
	
	//get and setter
	//override
	@Override
	public double calculateNetSalary() {
		return super.calculateNetSalary() + salesMade*commission/100;
	}
	
	
	//specific method
	public double getCommsission() {
		return salesMade * commission/100;
	}
	
	@Override
	public String toString() {
		return super.toString() +"\nSales Made:"+salesMade+"  Commission:"+commission+"%";
	}
	
	
	

}
