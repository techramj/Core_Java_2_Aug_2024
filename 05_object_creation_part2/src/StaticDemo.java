
public class StaticDemo {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Jack", 4000);
		Employee emp2 = new Employee("Jessica", 5000);
		Employee emp3 = new Employee();
		Employee emp4 = new Employee("Ajay", 5000);
		Employee emp5 = new Employee();
		Employee emp6 = new Employee("Sanjay", 5000);
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);
		System.out.println(emp6);
		
		System.out.println(emp1.getEmployeeCount()); //1
		System.out.println(emp5.getEmployeeCount());  //5
		System.out.println(Employee.getEmployeeCount());
	}

}
