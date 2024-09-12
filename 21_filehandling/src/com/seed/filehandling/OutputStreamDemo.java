package com.seed.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
	
	public static void example1(String filename) {
		
		try(FileOutputStream fos = new FileOutputStream(filename)){
			for(int i =65 ;i<= 100;i++) {
				fos.write(i);
			}
		}catch(IOException  e) {
			e.printStackTrace();
		}
	}
	
	//write file in append mode
	public static void example2(String filename) {
		try(FileOutputStream fos = new FileOutputStream(filename, true)){
			for(int i =65 ;i<= 100;i++) {
				fos.write(i);
			}
		}catch(IOException  e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		example1("file1.ext");
	}

}
