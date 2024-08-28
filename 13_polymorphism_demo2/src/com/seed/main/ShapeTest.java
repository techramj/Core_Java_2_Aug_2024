package com.seed.main;

import com.seed.model.shape.Circle;
import com.seed.model.shape.Rectangle;
import com.seed.model.shape.Shape;
import com.seed.model.shape.Square;

public class ShapeTest {
	
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 5);
		Square square = new Square(10);
		Circle circle = new Circle(25);
		
		displayDetails(r1);
		displayDetails(square);
		displayDetails(circle);
		
	}
	
	public static void displayDetails(Shape shape) {
		System.out.println("Details of "+shape.getClass().getSimpleName());
		System.out.println(shape);
		System.out.println("Area ="+shape.area());
		System.out.println("Perimeter = "+shape.perimeter());
		shape.display();
		System.out.println("\n");
	}

}
