package com.seed;

public class AccountDemo {
	
	public static void example() throws InterruptedException {
		Account account = new Account(1, 50000);
		Bank b1 = new Bank(account);
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b1);
		
		t1.setName("Jack");
		t2.setName("Jessica");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("\n\nremaining balance:"+account.getBalance());
	}
	
	public static void main(String[] args) {
		
		try {
			example();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
