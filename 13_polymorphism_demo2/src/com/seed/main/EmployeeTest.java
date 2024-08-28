package com.seed.main;

import java.io.Serializable;

import com.seed.model.Employee;
import com.seed.model.SalesPerson;
import com.seed.model.WageEmployee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "Jack", 5000);

		WageEmployee emp2 = new WageEmployee(2, "Jessica", 6000, 30, 10);

		SalesPerson emp3 = new SalesPerson(3, "Sam", 4000, 300000, 1);
		
		Employee[] empArr = new Employee[5];
		empArr[0] = new Employee(1, "Jack", 5000);
		empArr[1] = emp2;
		empArr[2] = emp3;
		empArr[3] = new WageEmployee(4, "Jay", 6000, 30, 10);
		empArr[4] = new SalesPerson(5, "Sama", 4000, 300000, 1);
		
		
		//printDetails(emp1);
		//printDetails(emp2);
		//printDetails(emp3);
		
		printDetails(empArr);
	}
	
	
	public static void printDetails(Employee[] arr) {
		for(Employee emp: arr) {
			printDetails(emp);
		}
	}
	
	
	public static void printDetails(Employee emp ) {
		System.out.println("Details of Employee: "+ emp.getName());
		System.out.println("-------------------------------------");
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(emp);
		System.out.println("Net salary: "+emp.getSalary());
		if(emp instanceof WageEmployee) {
			double variable = ((WageEmployee)emp).getVariable();
			System.out.println("Variable pay: "+variable);
		}
		
		if(emp instanceof SalesPerson) {
			double comm = ((SalesPerson)emp).getCommsission();
			System.out.println("Commission: "+comm);
		}
		System.out.println("\n");
	}
	
	
	public static void printDetails1(Employee emp ) {
		System.out.println("Details of Employee: "+ emp.getName());
		System.out.println("-------------------------------------");
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(emp);
		System.out.println("Net salary: "+emp.getSalary());
		//double variable = ((WageEmployee)emp).getVariable();
		//System.out.println("Variable pay: "+variable);
		System.out.println("\n");
	}
	
	public static void printDetails1(WageEmployee emp ) {
		System.out.println("Details of Employee: "+ emp.getName());
		System.out.println("-------------------------------------");
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(emp);
		System.out.println("Net salary: "+emp.getSalary());
		double variable = emp.getVariable();
		System.out.println("Variable pay: "+variable);
		System.out.println("\n");
	}
	
	public static void printDetails1(SalesPerson emp ) {
		System.out.println("Details of Employee: "+ emp.getName());
		System.out.println("-------------------------------------");
		System.out.println(emp.getClass().getSimpleName());
		System.out.println(emp);
		System.out.println("Net salary: "+emp.getSalary());
		double comm = emp.getCommsission();
		System.out.println("Commission: "+comm);
		System.out.println("\n");
	}

}

