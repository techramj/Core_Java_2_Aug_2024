package com.seed.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	
	public static void example1(String filename) {
		try(FileReader fr = new FileReader(filename)){
			int x;
			while((x= fr.read()) != -1) {
				System.out.print((char)x);
				Thread.sleep(10);
			}
		}catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void example2(String filename) {
		try(FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr)	
				){
			String str;
		
			while((str = br.readLine()) != null) {
				System.out.println(str);
				Thread.sleep(10);
			}
		}catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String filename= "/Users/kiranmishra/eclipse-workspace/java/21_filehandling/src/com/seed/filehandling/InputStreamDemo.java";
		example2(filename);
	}

}
