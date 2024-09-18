package com.seed;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements Runnable{
	
	private int red, green, blue;
	
	public MyFrame() {
		red = green = blue = 20;
		this.setSize(1500,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {
		//super.paint(g);
		g.setColor(Color.red);
		g.fillOval(red, 40, 20,20);
		
		g.setColor(Color.green);
		g.fillOval(green, 140, 20,20);
		
		g.setColor(Color.blue);
		g.fillOval(blue, 240, 20,20);
	}
	
	
	@Override
	public void run() {
		while(true) {
			if(Thread.currentThread().getName().equals("red")) {
				pause(20);
				red++;
				if(red%200 == 0) {
					try {
						synchronized (this) {
							wait();
						}
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(Thread.currentThread().getName().equals("green")){
				pause(40);
				green++;
				if(green%200 == 0) {
					try {
						synchronized (this) {
							wait();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			if(Thread.currentThread().getName().equals("blue")){
				pause(70);
				blue++;
				
				if(blue%200 == 0) {
					try {
						synchronized (this) {
							notifyAll();
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			repaint();
		}
		
	}
	
	
	private static void pause(int t) {
		try {
			Thread.sleep(t);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		MyFrame frame = new MyFrame();
		Thread t1 = new Thread(frame);
		Thread t2 = new Thread(frame);
		Thread t3 = new Thread(frame);
		
		t1.setName("red");
		t2.setName("green");
		t3.setName("blue");
		
		t1.start();
		t2.start();
		t3.start();
	}

}
