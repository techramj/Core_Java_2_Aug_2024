package com.seed.main;

import com.seed.model.SalesPerson;

public class SimpleInheritanceDemo {
	
	
	public static void main(String[] args) {
		SalesPerson sp1 = new SalesPerson(1, "jack", 5000, 100000, 1);
		System.out.println(sp1);
		System.out.println("Net salary: "+ sp1.calculateNetSalary());
		System.out.println("Commission: "+sp1.getCommsission()); //specific method
		
	}

}
