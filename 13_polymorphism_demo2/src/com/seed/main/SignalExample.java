package com.seed.main;

import com.seed.model.Bike;
import com.seed.model.Car;
import com.seed.model.Truck;
import com.seed.model.Vehicle;

public class SignalExample {
	
	public static void main(String[] args) {
		Bike b1 = new Bike();  //tight coupling
		Car c1 = new Car();
		Truck t1 = new Truck();
		
		Vehicle b2  = new Bike(); //loose coupling
		
		signal("green", b1);
		signal("red", b1);
		signal("green",c1);
		signal("green", t1);
	}
	
	public static void signal(String color, Vehicle v) {
		if(color.equals("green")) {
			v.start();
		}else {
			v.stop();
		}
	}

}
