package com.seed.localinnerclass;

public class Outer {
	
	public void display() {
		int a = 10;
		
		class Inner{
			void foo() {}
		}
		
		Inner ob = new Inner();
		ob.foo();
	}

}
