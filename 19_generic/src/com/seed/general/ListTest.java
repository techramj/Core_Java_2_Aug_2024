package com.seed.general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListTest {

	public static void example0() {
		List list1 = new ArrayList();
		list1.add(10); // autoboxing which will convert primitive 10 to Integer object
		list1.add(20);
		list1.add(3);
		list1.add(7);
		list1.add(22);
		list1.add(2);

		// rule 1 : Angular bracket, you can pass only object type, primitive types are
		// not allowed

		System.out.println("size of list: " + list1.size());
		// System.out.println("element at index 1: "+list1.get(1));

		System.out.println(list1);

		// list is ordered, unsorted

		int x = (Integer) list1.get(2);

	}

	public static void example1() {
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10); // autoboxing which will convert primitive 10 to Integer object
		list1.add(20);
		list1.add(3);
		list1.add(7);
		list1.add(22);
		list1.add(2);

		// rule 1 : Angular bracket, you can pass only object type, primitive types are
		// not allowed

		System.out.println("size of list: " + list1.size());
		// System.out.println("element at index 1: "+list1.get(1));

		System.out.println(list1);

		// list is ordered, unsorted
		
		displayList1(list1);
		displayList2(list1);
		displayList3(list1);
		displayList4(list1);

	}
	
	//delete even number from the list
	
	public static void deleteEvenNumber(List<Integer> list) {
		/*for(Integer i :list) {
			if(i%2 == 0) {
				list.remove(i); //this lead ConcurrentModification Exception
			}
		}*/
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			if(x%2 == 0) {
				itr.remove();
			}
		}
	}
	
	public static void doubleOddNumber(List<Integer> list) {
		ListIterator<Integer> itr = list.listIterator();
		
		while(itr.hasNext()) {
			
			int x = itr.next();
			if(x%2 == 1) {
				itr.remove();
				itr.add(2*x);
			}
		}
	}

	public static void displayList1(List<Integer> list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

	public static void displayList2(List<Integer> list) {
		for(Integer i :list) {
			System.out.print(i+" ");
		}
		System.out.println();
	}

	public static void displayList3(List<Integer> list) {
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			System.out.print(x+" ");
		}
		System.out.println();
	}
	
	
	public static void displayList4(List<Integer> list) {
		ListIterator<Integer> itr = list.listIterator();
		while(itr.hasNext()) {
			int x = itr.next();
			System.out.print(x+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		//example1();
		
		//ArrayList<Integer> ilist = new ArrayList<Integer>(); //Tight coupling
		List<Integer> ilist = new LinkedList<Integer>() ; //loose coupling
		
		//adding the data
		ilist.add(1); 
		ilist.add(2);
		ilist.add(3);
		ilist.add(7);
		ilist.add(22);
		ilist.add(2);
		
		//iterate list
		displayList1(ilist);
		
		
		//fetch the data for eg: fetch 3rd element
		int thridElement = ilist.get(2);
		
		//delete the element
		System.out.println(ilist);
		
		System.out.println("removing 22 from the list");
		ilist.remove(Integer.valueOf(22));  //remove element by object
		System.out.println(ilist);
		
		
		System.out.println("removing index 2");
		ilist.remove(2); //remove element by index
		System.out.println(ilist);
		
		
		//deleteEvenNumber(ilist);
		doubleOddNumber(ilist);
		
		displayList1(ilist);
		
		Collections.sort(ilist);
		System.out.println("After sorting....");
		displayList1(ilist);
	}

}
