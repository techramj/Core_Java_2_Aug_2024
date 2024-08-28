package com.seed.main;

import com.seed.model.Employee;
import com.seed.model.Printable;
import com.seed.model.shape.Circle;
import com.seed.model.shape.Rectangle;

public class InterfaceDmo {
	
	public static void main(String[] args) {
		//Printable p1 = new Printable(); //cannot create the object of printable
		printDetails(new Employee(1, "Jack", 5000));
		printDetails(new Rectangle(20,8));
		//printDetails(new Circle());  //circle not implemented printable
	}
	
	
	public static void printDetails(Printable printable) {
		printable.print();
	}

}
