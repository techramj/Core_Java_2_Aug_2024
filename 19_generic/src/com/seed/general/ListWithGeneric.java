package com.seed.general;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListWithGeneric {
	
	
	public static void main(String[] args) {
		//both side angular bracket contain same type
		List<Integer> ilist = new ArrayList<Integer>();
		ilist.add(10);
		ilist.add(3);
		ilist.add(23);
		//ilist.add(new Date()); //it will not allow to add any element other than Integer
		
		//java 7, introduce one feature, name is diamond feature
		List<Double> dlist = new ArrayList<>();
		dlist.add(1.2);
		dlist.add(2.3);
		dlist.add(3.0);
		
		
		List<String> slist = new ArrayList<>();
		slist.add("mac");
		slist.add("window");
		slist.add("unix");
		
		//displayUsingNonGeneric(ilist,"Displaying Integer list using non generic");
		//displayUsingNonGeneric(dlist,"Displaying Double list using non generic");
		
	
		displayUsingGeneric(ilist,"Displaying Integer List using generic");
		displayUsingGeneric(dlist,"Displaying Double List using generic");
		displayUsingGeneric(slist,"Displaying String List using generic");
		
		double avg1 = average(ilist);
		double avg2 = average(dlist);
		//average(slist);
	
		System.out.println("Average of Ilist= "+avg1);
		System.out.println("Average of double list= "+avg2);
	}
	
	
	public static double average(List<? extends Number> list) {  //? extends Number => lower bound wildcard
		double sum = 0;
		for(Number n:list) {
			sum = sum + n.doubleValue();
		}
		
		return sum/list.size();
	}
	
	public static void displayUsingGeneric(List<?> list, String msg) { // ?  =>  wildcard search
		//list.add(10);
		System.out.print(msg+"  =>");
		for(Object i:list) {
			System.out.print(i+"  ");
		}
		System.out.println("\n");
	}
	
	public static void displayUsingNonGeneric(List list, String msg) {
		list.add(new Date());
		System.out.print(msg+"  =>");
		for(Object i:list) {
			System.out.print(i+"  ");
		}
		System.out.println("\n");
	}
	
	

}
