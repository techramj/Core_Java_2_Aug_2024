package com.seed.filehandling;

import java.io.IOException;
import java.io.PrintWriter;

public class WriterDemo {
	
	public static void example1(String filename) {
		try(PrintWriter out = new PrintWriter(filename)){
			out.println("flow of byte is called steam");
			out.println("flow of character is called reader or writer");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		example1("file1.txt");
	}

}
