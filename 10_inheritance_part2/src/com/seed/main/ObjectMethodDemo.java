package com.seed.main;

import com.seed.model.Employee;

public class ObjectMethodDemo {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Jack", 5000);
		System.out.println(emp1);  //call toString
		System.out.println("class Name: "+emp1.getClass());
		
		
		Employee emp2 = new Employee(1,"Jessica", 5000);
		
		System.out.println("emp1 hashcode = "+emp1.hashCode());
		System.out.println("emp2 hashcode = "+emp2.hashCode());
		
		
		
	}

}
