package com.seed;

import java.util.concurrent.locks.ReentrantLock;

public class Account  {
	
	private int id;
	private double balance;
	String name= "";
	ReentrantLock lock;
	
	public Account() {
		// TODO Auto-generated constructor stub
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
	}
	
	public synchronized void withdraw(double amount) {
		//System.out.println(Thread.currentThread().getName()+" withdrawing the money");
		balance = balance - amount;
		//System.out.println(Thread.currentThread().getName()+" money withdrawn successfully");
		//System.out.println(Thread.currentThread().getName()+", current balance is "+balance);
		//System.out.println();
	}
	
	
	public  void withdraw1(double amount) {
		synchronized (this) {
			
			//System.out.println(Thread.currentThread().getName()+" withdrawing the money");
			balance = balance - amount;
			//System.out.println(Thread.currentThread().getName()+" money withdrawn successfully");
			//System.out.println(Thread.currentThread().getName()+", current balance is "+balance);
			//System.out.println();
		}
	}
	
	
	public  void withdraw2(double amount) {
		lock.lock();
			
			//System.out.println(Thread.currentThread().getName()+" withdrawing the money");
			balance = balance - amount;
			//System.out.println(Thread.currentThread().getName()+" money withdrawn successfully");
			//System.out.println(Thread.currentThread().getName()+", current balance is "+balance);
			//System.out.println();
		lock.unlock();
	}
	
	public double getBalance() {
		return balance;
	}

}
