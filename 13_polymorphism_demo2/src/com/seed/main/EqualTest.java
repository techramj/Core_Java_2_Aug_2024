package com.seed.main;

import com.seed.model.Date;
import com.seed.model.Employee;

public class EqualTest {
	
	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a==b);
		
		Employee emp = new Employee();
		
		Date d1 = new Date(1,1,2001);
		Date d2 = new Date(11,1,2001);
		boolean isDateSame1 = d1.equals(d1);
		boolean isDateSame2 = d1.equals(d2);
		boolean isDateSame3 = d1.equals(null);
		
		System.out.println("isDateSame1="+isDateSame1);
		System.out.println("isDateSame2="+isDateSame2);
		System.out.println("isDateSame3="+isDateSame3);
		
		
	}

}
