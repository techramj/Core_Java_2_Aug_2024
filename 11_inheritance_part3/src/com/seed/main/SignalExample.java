package com.seed.main;

import com.seed.model.Bike;
import com.seed.model.Car;

public class SignalExample {
	
	public static void main(String[] args) {
		Bike b1 = new Bike();
		Car c1 = new Car();
	
		
		signal("green", b1);
		signal("red", b1);
		signal("green",c1);
	}
	
	public static void signal(String color, Bike bike) {
		if(color.equals("green")) {
			bike.start();
		}else {
			bike.stop();
		}
	}
	
	public static void signal(String color, Car car) {
		if(color.equals("green")) {
			 car.start();
		}else {
			car.stop();
		}
	}

}
