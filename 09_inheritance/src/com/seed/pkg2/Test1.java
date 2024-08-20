package com.seed.pkg2;

import com.seed.pkg1.Employee;

public class Test1 {
	
	
	public static void main(String[] args) {
		//Employee emp = new Employee();
		WageEmployee we1 = new WageEmployee();
		System.out.println(we1);  //we1.toString();
		System.out.println("Net salary: "+we1.calculateNetSalary());
		
		System.out.println("-----------------");
		
		WageEmployee we2 = new WageEmployee(1, "Jessica", 4000, 20, 10);
		System.out.println(we2);
		System.out.println("Net salary: "+we2.calculateNetSalary());
	
		
	}

}
