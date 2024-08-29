package com.seed;

public class StringTest1 {
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {1,2,3};
		
		System.out.println(str1 == str2);
		System.out.println(arr1 == arr2);
		System.out.println(str1 == str3);
		
		
		str1 = str1.concat("def");
		
		System.out.println("str1="+str1);
		System.out.println("str2="+str2);
	}

}
