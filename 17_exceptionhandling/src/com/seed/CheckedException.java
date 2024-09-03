package com.seed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {

	public static void readFileExample1() {
		String str = "/Users/kiranmishra/eclipse-workspace/java/17_exceptionhandling/src/com/seed/CheckedException.java";

		try {
			FileInputStream fis = new FileInputStream(str);
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				Thread.sleep(10);
				x = fis.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("invalid file name");
		} catch (IOException e) {
			System.out.println("Not able to read the file");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
		//file is not closed
	}

	public static void readFileExample2() {
		// read the file
		String str = "/Users/kiranmishra/eclipse-workspace/java/17_exceptionhandling/src/com/seed/CheckedException.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(str);
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				Thread.sleep(20);
				x = fis.read();
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (InterruptedException e) {
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} catch (Exception e) {
			try {
				fis.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}

	}

	public static void readFileExample3() {
		// read the file
		String str = "/Users1/kiranmishra/eclipse-workspace/java/17_exceptionhandling/src/com/seed/CheckedException.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(str);
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				Thread.sleep(20);
				x = fis.read();
			}

		} catch (FileNotFoundException e) {
			System.out.println("invalid filename");
		} catch (IOException e) {
			System.out.println("not able to read the file");
			//e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("error while sleep");
			//e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("finally block called");
			try {
				if (fis != null) {
					fis.close();
				}

			} catch (IOException e1) {
			}
		}

	}
	
	public static void readFileExample4() {
		// read the file
		String str = "/Users1/kiranmishra/eclipse-workspace/java/17_exceptionhandling/src/com/seed/CheckedException.java";
		try (FileInputStream fis = new FileInputStream(str)){
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				Thread.sleep(20);
				x = fis.read();
			}

		} catch (FileNotFoundException e) {
			System.out.println("invalid filename");
		} catch (IOException e) {
			System.out.println("not able to read the file");
			//e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("error while sleep");
			//e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
	
	public static void readFileExample5() {
		// read the file
		String str = "/Users1/kiranmishra/eclipse-workspace/java/17_exceptionhandling/src/com/seed/CheckedException.java";
		try (FileInputStream fis = new FileInputStream(str)){
			int x = fis.read();
			while (x != -1) {
				System.out.print((char) x);
				Thread.sleep(20);
				x = fis.read();
			}

		} catch (FileNotFoundException e) {
			System.out.println("invalid filename");
		} catch (IOException|InterruptedException e) {  //multicatch
			System.out.println("not able to read the file");
		}catch (Exception e) {
			e.printStackTrace();
		} 

	}

	public static void main(String[] args) {
		readFileExample3();
	}

}
