package com.seed.general;

public class Generic<T> {
	
    private T instance;
	
	public Generic() {
		// TODO Auto-generated constructor stub
	}
	
	public Generic(T instance) {
		this.instance = instance;
	}
	
	public T getInstance() {
		return instance;
	}
	
	@Override
	public String toString() {
		return instance.toString();
	}

}
