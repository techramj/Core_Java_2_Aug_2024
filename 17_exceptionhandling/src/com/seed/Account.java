package com.seed;

import com.seed.exception.InSufficientBalanceException;

public class Account {
	
	private int accountId;
	private double balance;
	
	
	public Account() {
		
	}
	
	public Account(int accountId, double balance) {
		this.accountId = accountId;
		this.balance = balance;
	}
	
	public void withdrawl(double amount) throws InSufficientBalanceException{
		if(this.balance <amount) {
			throw new InSufficientBalanceException("Insufficient balance. amount to be withdraw ="+amount+"  balance="+balance);
		}
		this.balance = this.balance - amount;
		System.out.println("amount withdrawl successfully. current balance="+this.balance);
		//throw the exception
		
	}

}
