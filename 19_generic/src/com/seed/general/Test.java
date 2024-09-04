package com.seed.general;

public class Test {
	
	public static void generalTest() {
		//store the number
		General iob = new General(10);
		
		//store the string
		General sob = new General("apple");
		
		int x = (Integer)iob.getInstance();
		String str = (String)sob.getInstance();
		
		System.out.println(iob);
		System.out.println(sob);
		
		iob = sob;
		
		//x = (Integer)iob.getInstance();
		
	}
	
	
	public static void genericTest() {
		//store the number
		Generic<Integer> iob = new Generic<Integer>(10);
		
		//store ehte string
		Generic<String> sob = new Generic<String>("apple");
		
		int x = iob.getInstance();
		String str = sob.getInstance();
		
		//iob = sob;  //type safety is avaialable when you use generic
	}
	
	
	
	public static void main(String[] args) {
		generalTest();
	}

}
