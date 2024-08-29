package com.seed.annoynomousinnerclass;

public class Test {
	
	public static void main(String[] args) {
		Dog dog = new Dog() {
			public void speak() {
				System.out.println("boowwwwwwww");
			}
		};
		dog.speak();
		System.out.println(dog.getClass().getName());
		
		Shape shape1 = new Shape() {
			@Override
			public void area() {
			
			}
		};
		
		Printable p1 = new Printable() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
