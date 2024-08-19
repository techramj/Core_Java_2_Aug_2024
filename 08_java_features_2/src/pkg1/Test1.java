package pkg1;

public class Test1 {
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.id = 10;  //id has public access specifier
		emp.name = "Jack";  //name has protected access specifier
		emp.salary = 5000;  //salary has default access specifier
		//emp.bonus = 1000; // bonus has private access specifier
		
	}

}
