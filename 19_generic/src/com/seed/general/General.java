package com.seed.general;

public class General {
	
	private Object instance;
	
	public General() {
		// TODO Auto-generated constructor stub
	}
	
	public General(Object instance) {
		this.instance = instance;
	}
	
	public Object getInstance() {
		return instance;
	}
	
	@Override
	public String toString() {
		return instance.toString();
	}

}
