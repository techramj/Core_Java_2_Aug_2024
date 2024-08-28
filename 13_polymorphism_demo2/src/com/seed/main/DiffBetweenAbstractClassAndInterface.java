package com.seed.main;

public class DiffBetweenAbstractClassAndInterface {
	public static void main(String[] args) {
		//A ob = new A(); //cannot create the instance of Abstract
		//P ob1 = new P();//cannot create the instance of interface
		System.out.println(P.a);
	}
}


abstract class A{	
	int a;  //non static
	abstract void display();
	void foo() {}
}

interface P{
	int a = 10; //interface all member by default are public static final
	public static final int b = 20;
	void display();  //by default method are abstract
	//void foo() {}  //concrete method are not allowed
}

class B extends C implements Q, R{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}} 
class C extends A{
	@Override
	 void foo() {
		// TODO Auto-generated method stub
		super.foo();
	}

	@Override
	void display() {
		
	}
}


interface Q{} 
interface R extends Q,P{}  //interface extends one or more interface(s)
