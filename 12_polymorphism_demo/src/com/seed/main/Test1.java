package com.seed.main;

import com.seed.model.Employee;
import com.seed.model.WageEmployee;

public class Test1 {
	
	public static void example1() {
		Employee emp1 = new Employee(1,"Jack", 5000);
		
		WageEmployee emp2 = new WageEmployee(2, "Jessica", 6000, 30, 10);
		
		Employee emp3 = new WageEmployee(3, "Sam", 4000, 30000, 1);
		
		emp1.foo();  //foo method of emp class
		emp2.foo();  //foo method of we
		emp3.foo();	//foo method of we
		
		System.out.println(emp1.x+"   emp1.getX()="+emp1.getX());
		System.out.println(emp2.x+"   emp2.getX()="+emp2.getX());
		System.out.println(emp3.x+"   emp3.getX()="+emp3.getX());
	}
	
	
	public static void example2() {
		Employee emp1 = new Employee(1,"Jack", 5000);
		WageEmployee emp2 = new WageEmployee(2, "Jessica", 6000, 30, 10);
		Employee emp3 = new WageEmployee(3, "Sam", 4000, 30, 10);
		
		//emp3.getVariable(); // error bcz during compilation compiler will search getVariable method in EMployee class
		
	   //if you want to call any specific method from superclass reference then typecast the reference
		double var = ((WageEmployee)emp3).getVariable();
		System.out.println("variable = "+var);
	}
	
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Jack", 5000);
		WageEmployee emp2 = new WageEmployee(2, "Jessica", 6000, 30, 10);
		Employee emp3 = new WageEmployee(3, "Sam", 4000, 30, 10);
			
	
	}
}
