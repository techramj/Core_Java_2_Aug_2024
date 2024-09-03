package com.seed;

public class AutoClosableExample {
	
	public static void approach1() {
		B ob = null;
		try {
			ob = new B();
			int x = 1/0;
			System.out.println("no error");
		}catch(Exception e) {
			System.out.println("error");
		}finally {
			try {
				ob.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void approach2() {
		try(B ob = new B()){
			int x = 1/0;
			System.out.println("no error");
		}catch(Exception e) {
			System.out.println("error");
		}
	}
	
	
	public static void main(String[] args) {
		//A is not autocloseable, cannot be used as try with resource
		/*try(A ob = new A){
			
		}catch(Exception e) {
			
		}*/
		
		//approach1();
		approach2();
		
		
		
	}
	
	
	static class A {
		public void close() throws Exception {
			System.out.println("close method called");
		}
	} 
	
	static class B implements AutoCloseable{

		@Override
		public void close() throws Exception {
			System.out.println("close method called");
			
		}
		
	}

}
