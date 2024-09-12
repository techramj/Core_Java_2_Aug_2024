package com.seed.filehandling;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleExample {
	
	public static void example1() throws IOException {
		try(BufferedInputStream bis = new BufferedInputStream(System.in)){
			System.out.println("Enter you name: ");
			int x;
			while((x=bis.read())!= -1) {
				System.out.print((char)x);
			}
		}
	}
	
	public static void example2() throws IOException {
		try(InputStreamReader is = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(is);){
			System.out.println("enter name");
			String name = br.readLine();
			System.out.println("enter year of exp: ");
			String yearOfExp = br.readLine();
			System.out.println("name: "+name+" exp: "+yearOfExp);
		}
	}
	
	
	public static void example3() throws IOException {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println("enter name");
			String name = br.readLine();
			System.out.println("enter year of exp: ");
			int yearOfExp = Integer.parseInt(br.readLine());
			System.out.println("name: "+name+" exp: "+yearOfExp);
		}
	}
	
	public static void example4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name:");
		String name = sc.nextLine();
		System.out.println("enter exp: ");
		int x =sc.nextInt();
		System.out.println(name+"   "+x);
	}
	
	public static void main(String[] args) {
		example4();
	}
	
	private static void print(byte[] arr) {
		for(byte b: arr) {
			System.out.print((char)b);
		}
	}

}
