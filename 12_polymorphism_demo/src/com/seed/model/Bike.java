package com.seed.model;

public class Bike extends Vehicle {
	
	@Override
	public void stop() {
		System.out.println("stop bike");
	}
	
	@Override
	public void start() {
		System.out.println("start bike");
	}
}
