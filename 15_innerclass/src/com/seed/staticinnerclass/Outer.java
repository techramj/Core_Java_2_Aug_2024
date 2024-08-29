package com.seed.staticinnerclass;

public class Outer {
	
	private int a = 10;
	private static int b = 20;

	static class Inner{
		static int c = 30;
		public void display() {
			System.out.println(c);
		}
	}
}
