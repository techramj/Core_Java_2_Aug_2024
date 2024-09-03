package com.seed;

import com.seed.exception.InSufficientBalanceException;
import com.seed.exception.InvalidDateExcpetion;

public class UserDefinedExceptionDemo {
	
	public static void main(String[] args)  {
		try {
		Date d1 = new Date(1,1,2010);
		}catch(InvalidDateExcpetion e) {
			System.err.println(e.getMessage());
		}
		
		Account account = new Account(1, 50000);
		try {
			account.withdrawl(30000);
			account.withdrawl(30000);
		}catch(InSufficientBalanceException e) {
			e.printStackTrace();
		}
	}

}
