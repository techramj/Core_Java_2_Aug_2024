package com.seed.general;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	
	
	
	
	public static void example1() {
		Set<Integer> set  = new HashSet<Integer>();
		boolean b;
		b= set.add(10);
		System.out.println(b);
		
		
		b= set.add(20);
		System.out.println(b);
		
		set.add(3);
		set.add(40);
		set.add(20);
		b= set.add(10);
		System.out.println(b);
		
		//how many element we have added
		System.out.println("No of element: "+set.size());
		System.out.println(set);
	}
	
	
	public static void example2() {
		Set<Integer> set  = new TreeSet<Integer>();
		boolean b;
		b= set.add(10);
		System.out.println(b);
		
		
		b= set.add(20);
		System.out.println(b);
		
		set.add(3);
		set.add(40);
		set.add(20);
		b= set.add(10);
		System.out.println(b);
		
		set.add(1);
		set.add(12);
		set.add(3);
		
		
		//how many element we have added
		System.out.println("No of element: "+set.size());
		System.out.println(set);
	}
	
	
	public static void example3() {
		Set<Integer> set  = new LinkedHashSet<Integer>();
		boolean b;
		b= set.add(10);
		b= set.add(20);
		set.add(3);
		set.add(40);
		set.add(20);
		b= set.add(10);
		set.add(1);
		set.add(12);
		set.add(3);
		
		
		//how many element we have added
		System.out.println("No of element: "+set.size());
		System.out.println(set);
	}
	
	public static void example4() {
		Employee emp1 = new Employee(1, "Sanjay", 4000);
		Employee emp2 = new Employee(3, "Pranjay", 9000);
		Employee emp3 = new Employee(5, "Vijay", 6000);
		Employee emp4 = new Employee(2, "Mritunjay", 5000);
		Employee emp5 = new Employee(4, "Ajay", 4800);
		Employee emp6 = new Employee(1, "Sanjay", 4000);
		
		
		Set<Employee> set = new HashSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		
		System.out.println(emp1.equals(emp6));
		
		System.out.println("hashcode of emp1= "+emp1.hashCode());
		System.out.println("hashcode of emp6= "+emp6.hashCode());
		
		
		display(set,"\ndisplay details of employee set");
	
	}
	
	
	

	public static void example5() {
		Employee emp1 = new Employee(1, "Sanjay", 4000);
		Employee emp2 = new Employee(3, "Pranjay", 9000);
		Employee emp3 = new Employee(5, "Vijay", 6000);
		Employee emp4 = new Employee(2, "Mritunjay", 5000);
		Employee emp5 = new Employee(4, "Ajay", 4800);
		Employee emp6 = new Employee(1, "Sanjay", 4000);
		
		
		Set<Employee> set = new TreeSet<Employee>();
		set.add(emp1);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		set.add(emp5);
		set.add(emp6);
		
		
		display(set,"\ndisplay details of employee set");
	
	}
	
	public static void main(String[] args) {
		example5();
		
	}
	
	
	public static void display(Set<?> set,String msg) {
		System.out.println(msg);
		System.out.println("----------------------------------");
		for(Object o: set) {
			System.out.println(o);
		}
		System.out.println();
	}

}
