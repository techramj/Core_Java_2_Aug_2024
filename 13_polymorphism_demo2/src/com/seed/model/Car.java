package com.seed.model;

public class Car extends Vehicle {
	
	@Override
	public void stop() {
		System.out.println("stop car ");
	}

	@Override
	public void start() {
		System.out.println("start car");
	}

}
