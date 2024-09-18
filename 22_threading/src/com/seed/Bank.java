package com.seed;

public class Bank extends Thread {
	
	Account account;
	
	public Bank(Account account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			account.withdraw(500);
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
