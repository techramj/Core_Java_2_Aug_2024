package com.seed;

public class AnotherThread  implements Runnable {
   int a = 0;
	
	@Override
	public void run() {
		for(int i =1;i<=10;i++) {
			a++;
			System.out.println(Thread.currentThread().getName()+" i="+i+"  a="+a);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
