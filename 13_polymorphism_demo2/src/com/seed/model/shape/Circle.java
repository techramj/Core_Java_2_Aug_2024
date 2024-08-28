package com.seed.model.shape;

public class Circle extends Shape{
	
	private double radius;
	private static final double PI = 3.14;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		
		return PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * PI * radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "Radius: "+radius;
	}
	
}
