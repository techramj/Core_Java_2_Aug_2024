package com.seed;

public class WrapperDemo {
	
	public static void example1() {
		int a = 10;  // int is primitive type
		
		///from primitive to object
		Integer iob = new Integer(10); 
		Integer iob1 = Integer.valueOf(10);
		Integer iob2 = Integer.valueOf(10);
		
		//from object to primitive
		int x = iob2.intValue();
		
		//from string to primitive
		int x1 = Integer.parseInt("10");
		float f1 = Float.parseFloat("10.2");
		
		
		//from string to Wrapper
		Integer iob3= Integer.valueOf("10");
	}
	
	public static void example2() {
		//size
		System.out.println("size of int: "+Integer.SIZE);
		System.out.println("Min value of int: "+Integer.MIN_VALUE);
		System.out.println("Max value of int: "+Integer.MAX_VALUE);
		
		
		//convert String int
		String num1 = "10";
		String num2 = "20";
		int x = Integer.parseInt(num1);
		int y = Integer.parseInt(num2);
		int res = x + y;
		System.out.println(res);
		
	}
	
	public static void example3() {
		int a = 10;
		int b = 20;
		int r = a + b;
		
		
		Integer ob1 = new Integer(10);
		Integer ob2 = Integer.valueOf(20);
		int x = ob1.intValue() + ob2.intValue();
		Integer res = Integer.valueOf(x);
		
		
		//boxing and unboxing
		Integer i1 = 10;
		Integer i2 = 20;
		Integer i3 = i1 + i2;  // unboxing i1 and i2, then add then number and result => boxing => i3 object
	}
	
	public static void main(String[] args) {
		example2();
	}

}
