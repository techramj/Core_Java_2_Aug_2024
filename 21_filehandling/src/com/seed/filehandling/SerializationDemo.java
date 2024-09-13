package com.seed.filehandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.seed.Employee;

public class SerializationDemo {
	
	
	public static void writeEmployeeObject(String filename, Employee emp) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(emp);  //serialization
			System.out.println(emp+"  object saved in file "+filename);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Employee readEmployeeObject(String filename) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			Employee emp = (Employee)ois.readObject();   //deserialization
			return emp;
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	private static void readExample1() {
		Employee emp2 = readEmployeeObject("emp.dat");
		Employee emp3 = readEmployeeObject("emp.dat");
		System.out.println(emp2 == emp3);
		System.out.println(emp2);
		System.out.println(emp3);;
	}
	
	public static void main(String[] args) {
		//write emp object into file emp.dat
		Employee emp1  = new Employee(1,"Jack",4000);
		//writeEmployeeObject("emp.dat", emp1);
		writeEmployeeObject("emp1.dat", emp1);
		
		
		
		//read the emp object from the file emp.dat
		//readExample1();
		Employee e1 = readEmployeeObject("emp1.dat");
		System.out.println(emp1 == e1);
		
		System.out.println(e1);
		
	}

}
