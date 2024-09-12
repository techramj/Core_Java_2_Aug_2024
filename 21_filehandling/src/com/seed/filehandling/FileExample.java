package com.seed.filehandling;

import java.io.File;
import java.io.IOException;

public class FileExample {
	
	public static void example1(String filename) {
		System.out.println("details of "+filename);
		System.out.println("......................");
		File file = new File(filename);
		System.out.println("file exists: "+file.exists());
		System.out.println("full path: "+file.getAbsolutePath());
		System.out.println("file is directory/folder: "+file.isDirectory());
		
		//create the newFile
		try {
			boolean isCreated = file.createNewFile();
			System.out.println("file created? "+isCreated);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		example1("file1.txt");
		example1("dir");
	}

}
