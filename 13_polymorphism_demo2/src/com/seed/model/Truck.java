package com.seed.model;

public class Truck  extends Vehicle
{

	@Override
	public void start() {
		System.out.println("start Truck");
	}
	
	@Override
	public void stop() {
		System.out.println("stop truck");
	}
}
