package pkg2;

import pkg1.Employee;
//import pkg1.*;  //pkg1.* means import all class inside package pkg1. Avoid using *
import static pkg1.Employee.companyName;
import static java.lang.System.out;
public class Test3 {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		pkg1.Employee e1 = new pkg1.Employee();
		pkg3.Employee e2 = new pkg3.Employee();
		
	    out.println(companyName);
	}

}

