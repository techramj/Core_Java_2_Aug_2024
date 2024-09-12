package com.seed.filehandling;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	
	public static void example1(String filename) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filename);
			int x = fis.read();
			while(x != -1) {
				System.out.print((char)x);
				x = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public static void example2(String filename) {
		try(FileInputStream fis  = new FileInputStream(filename)) {
			int x;
			while((x = fis.read())!= -1) {
				System.out.print((char)x);
				Thread.sleep(5);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void example3(String filename) {
		try(FileInputStream fis  = new FileInputStream(filename);
		BufferedInputStream  bis = new BufferedInputStream(fis)){
			byte[] arr = bis.readAllBytes();
			System.out.println(arr.length);
			for(byte b:arr) {
				System.out.print((char)b);
				Thread.sleep(5);
			}
		}catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void example4(String filename) {
		try(FileInputStream fis  = new FileInputStream(filename);
		DataInputStream  dis = new DataInputStream(fis)){
			String str;
			
			while( (str = dis.readLine()) != null){
				System.out.println(str);
				Thread.sleep(100);
			}
			
		}catch(IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		String filename= "/Users/kiranmishra/eclipse-workspace/java/21_filehandling/src/com/seed/filehandling/InputStreamDemo.java";
		example4(filename);
		
	}

}
