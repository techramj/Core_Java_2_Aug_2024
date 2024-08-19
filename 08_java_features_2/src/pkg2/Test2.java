package pkg2;

public class Test2 {
	
	public static void main(String[] args) {
		
		pkg1.Employee emp = new pkg1.Employee();
		emp.id = 100;
		//emp.name = "Sam";
		//emp.salary = 5000;
		
		pkg1.Employee emp2 = new pkg1.Employee(1,"Sam",2000,200);
		System.out.println(emp2);
	}

}
