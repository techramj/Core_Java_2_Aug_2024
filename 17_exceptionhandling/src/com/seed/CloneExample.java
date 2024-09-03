package com.seed;

public class CloneExample {
	
	public static void main(String[] args) {
		Date d1 = new Date(1,1,2001);
		try {
			Date d2 = d1.clone();
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d1 == d2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
