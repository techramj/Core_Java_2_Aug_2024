package com.seed;

public class StringTest3 {
	
	public static void main(String[] args) {
		int a = 10;
		switch(a) {
		case 1:
		case 2:
		}
		
		//java 7 , new features is added string can be used in switch case
		String color ="red";
		String str ="";
		switch(color) {
		case "green":
			str = "go"; break;
		case "red":
			str = "stop"; break;
		case "yellow":
			 str = "look and go/stop"; break;
		default:
				str ="no sinnal";
		}
		
	}

}
