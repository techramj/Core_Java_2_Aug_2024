package com.seed.mutable;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("");
		for(int i=65;i<=90;i++) {
			sb.append((char)i);
		}
		String str = sb.toString();
		System.out.println(str);
		
		String s1="abcdefghij";
		System.out.println(s1.contains("apple"));
		String s1InUpperCase = s1.toUpperCase();
		String subStr = s1.substring(3,6);
		System.out.println(subStr);
	}

}
