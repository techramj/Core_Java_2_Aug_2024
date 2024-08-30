package com.seed;

public class UnChecedExceptionExample {
	
	public static void main(String[] args) {
		//division of rwo number passed from the arguments
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int res = a / b;
			System.out.println("result = "+res);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Pass alteast two argument from the command line");
		}catch(NumberFormatException e) {
			System.out.println("Please pass only integer value in the arguments");
		}catch(ArithmeticException e) {
			System.out.println("2nd argumenet must not be 0");
		}catch(Exception e) {
			System.out.println("error: "+e.getMessage());
		}
		
		System.out.println("end");
	}

}
