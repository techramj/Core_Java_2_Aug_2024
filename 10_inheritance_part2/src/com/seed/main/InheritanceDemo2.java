package com.seed.main;

import com.seed.model.Dummy;
import com.seed.model.Employee;
import com.seed.model.SalesPerson;
import com.seed.model.WageEmployee;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(1,"Jack", 5000);
		WageEmployee emp2 = new WageEmployee(2,"sam", 3000,40,20);
		SalesPerson emp3 = new SalesPerson(3,"Jessica", 8000,500000,1);
		
		emp1.display();
		emp2.display();
		emp3.display();
		
	}

}
