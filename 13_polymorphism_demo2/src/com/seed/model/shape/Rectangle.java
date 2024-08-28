package com.seed.model.shape;

import com.seed.model.Printable;

public class Rectangle extends Shape implements Printable {
	
	private double length;
	private double width;
	
	public Rectangle() {
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double area() {
		return length * width;
	}

	@Override
	public double perimeter() {
		return  2 * (length + width);
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	@Override
	public void print() {
		System.out.println("Details are");
		System.out.println(this);
		System.out.println("Area ="+area());
		System.out.println("Perimeter= "+perimeter());
		System.out.println();
	}
	

}
