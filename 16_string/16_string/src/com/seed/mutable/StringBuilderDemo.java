package com.seed.mutable;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("");
		for(int i=65;i<=90;i++) {
			sb.append((char)i);
		}
		String str = sb.toString();
		System.out.println(str);
	}

}
