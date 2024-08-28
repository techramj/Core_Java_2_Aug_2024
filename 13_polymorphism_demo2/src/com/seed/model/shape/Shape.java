package com.seed.model.shape;

public abstract class Shape {
	
	private int a;
	
	public Shape() {}
	
	public Shape(int a) {
		this.a = a;
	}
	
	public abstract double area();
	
	public abstract double perimeter();
	
	public void display() {
		System.out.println("display method of shape class");
		System.out.println("a = "+a);
	}

}
