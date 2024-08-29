package com.seed.simpleinnerclass;

public class Test {
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner innerOb = outer.new Inner();
		
		Outer.Inner innerOb2 = new Outer().new Inner();
	}

}
