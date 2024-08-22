package com.seed.model;

public class Child  extends Parent{
	
	@Override
	public void method1() {}   //public => public
	
	@Override
	protected void method2() {} // protected => public, protected
	
	//@Override
	void method3() { }    //default =>  public, protected, default
	
	//@Override //private method cannot be overridden
	public int method4() { return 0;}
	
	public void add(int a, int b) {
		
	}
	
	public int add(int a, int b, int c) { 
		
		return 0;
	}

}
