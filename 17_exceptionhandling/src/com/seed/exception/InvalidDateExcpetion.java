package com.seed.exception;

public class InvalidDateExcpetion extends RuntimeException{
	
	public InvalidDateExcpetion() {
		super("Invalid date");
	}  
	
	public InvalidDateExcpetion(String message) {
		super(message);
	}  

}


//InvalidDateExcpetion is checked exception when it extends Exception
//InvalidDateExcpetion is unchecked exception when it extends RuntimeException