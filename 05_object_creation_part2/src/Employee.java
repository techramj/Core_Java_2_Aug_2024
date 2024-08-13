
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	private static int idGenerator = 0;
	
	public Employee() {
		idGenerator = idGenerator + 1;
		id = idGenerator;
	}

	public Employee(String name, double salary) {
		idGenerator = idGenerator + 1;
		this.id = idGenerator;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display() {  //avoid display method, better to use toString
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println();
	}
	
	public void finalize() { //last wish
		System.out.println("Wish from name: "+name+"=> Duao mai yad rakhna");
	}
	
	public String toString(){
		return "Id: "+id+"  Name: "+name+" Salary:"+salary+"\n";
	}
	
	
	public static int getEmployeeCount() {
		return idGenerator;
	}
}
