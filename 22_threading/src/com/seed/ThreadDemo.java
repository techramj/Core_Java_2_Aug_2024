package com.seed;

public class ThreadDemo {
	
	public static void example1() {
		//two different object and two thread 
		long l1 = System.currentTimeMillis();
		Thread t1 = new MyThread();
		Thread t2 = new MyThread();
		t1.setName("one");
		t2.setName("two");
		//t1.run(); //run will not start the thread
		//t2.run();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		long l2 = System.currentTimeMillis();
		long time = l2 -l1;
		System.out.println("Total time taken ="+time+" ms");
	}
	
	public static void example2() {
		//one  object and two different thread 
		long l1 = System.currentTimeMillis();
		MyThread ob = new MyThread();
		Thread t1 = new Thread(ob);
		Thread t2 = new Thread(ob);
		t1.setName("one");
		t2.setName("two");
		//t1.run(); //run will not start the thread
		//t2.run();
		
		t1.start();
		t2.start();
		
		long l2 = System.currentTimeMillis();
		long time = l2 -l1;
		System.out.println("Total time taken ="+time+" ms");
	}
	
	
	public static void example3() {
		Runnable ob1 = new AnotherThread();
		Runnable ob2 = new AnotherThread();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob2);
		t1.start();
		t2.start();
	}
	
	//example 2 and example 4 are same
	public static void example4() {
		Runnable ob1 = new AnotherThread();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob1);
		t1.start();
		t2.start();
	}
	
	
	public static void example5() {
		Runnable ob1 = new AnotherThread();
		Thread t1 = new Thread(ob1);
		Thread t2 = new Thread(ob1);
		System.out.println(t1.getPriority()); //default proiority = 5 max =10, min =1
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
	
	
	private static void pause(int timeInMs) {
		try {
			Thread.sleep(timeInMs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void dameonThreadExample() {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" - "+i);
					pause(1000);
					
				}
			}
		};
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(Thread.currentThread().getName()+" - "+i);
					pause(200);
				}
			}
		};
		t1.setName("one");
		t2.setName("two");
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
	}
	
	public static void main(String[] args) {
		dameonThreadExample();
	}

}
