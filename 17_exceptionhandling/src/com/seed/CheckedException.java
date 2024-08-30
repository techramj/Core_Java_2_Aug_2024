package com.seed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public static void main(String[] args) {
		//read the file
		String str ="/Users/kiranmishra/eclipse-workspace/java/17_exceptionhandling/src/com/seed/CheckedException.java";
		
		try {
			FileInputStream fis = new FileInputStream(str);
			int x = fis.read();
			while(x != -1) {
				System.out.print((char)x);
				Thread.sleep(10);
				x = fis.read();
			}
		}catch(FileNotFoundException e) {
			System.out.println("invalid file name");
		}catch(IOException e) {
			System.out.println("Not able to read the file");
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
