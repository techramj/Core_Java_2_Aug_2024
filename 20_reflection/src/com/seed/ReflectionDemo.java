package com.seed;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReflectionDemo {

	public static void example1() {
		// how we creating object =>new keyword, serialization, reflection

		// Employee e1 = new Employee();
		// Employee e2 = new Employee();

		Class clazz = null;

		try {
			clazz = Class.forName("com.seed.Employee"); // load the employees class
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} // load the class
	}
	
	public static void example2() {
		Employee e1 = new Employee();
		Class clazz = e1.getClass();
	}
	
	public static void displayDetails() {
		Employee e1 = new Employee();
		Class clazz = e1.getClass();
		
		//display data member;
		
		Field[] fields =  clazz.getDeclaredFields();
		System.out.println("\nList of Data member of "+clazz.getSimpleName());
		for(Field f:fields) {
			String typeName = f.getType().getName();
			int modifier = f.getModifiers();
			System.out.println(Modifier.toString(modifier)+" "+typeName+" "+f.getName());
		}
		
		//display method
		System.out.println("\nList of method....");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method f:methods) {
			String returnType = f.getReturnType().getName();
			int modifier = f.getModifiers();
			System.out.print(Modifier.toString(modifier)+" "+returnType+" "+f.getName()+"(");
			Parameter[] parameters = f.getParameters();
			
			for(Parameter p:parameters) {
				String typeName = p.getType().getName();
				String paramName = p.getName();
				System.out.print(typeName +" "+paramName+",");
			}
			
			System.out.println(")");
			
			
			Annotation[] arr = f.getDeclaredAnnotations();
			if(arr.length >0 ) {
				System.out.println("\nAnnotation Details");
				System.out.println("....................");
			}
			for(Annotation a: arr) {
				System.out.println(a);
			}
			
			
			System.out.println("--------------------------------------------");
		}
		
		
	}
	
	
	@SuppressWarnings({ "unused", "rawtypes" })
	public static void supressWarningExample() {
		
		int a = 10;
		int b = 10;
		
		//@SuppressWarnings("rawtypes")
		List list = new ArrayList<>();
		
		//@SuppressWarnings("rawtypes")
		Set s = new HashSet<>();
		System.out.println(list);
	}

	public static void main(String[] args) {
		displayDetails();
	}

}
