
public class Employee {
	
	private int id;
	private String name;
	private double basicSalary;
	private double hra;  //40% of bs
	private double pf;   //12% of bs
	
	public Employee() {
		//initialize default id =1, name="no name", salary=1000
		/*
		id = 1;
		name = "no name";
		basicSalary = 1000;
		hra = .4 * basicSalary;
		pf = .12 * basicSalary;
		*/
		this(1,"no name", 1000); //chaining of constructor
		//this constructor must be the first line
	}
	
	public Employee(int id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		calaculateSalaryComponent();
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
		calaculateSalaryComponent();
		
	}

	public double getHra() {
		return hra;
	}

	public double getPf() {
		return pf;
	}

	public void display() {
		System.out.println("Id: "+this.id+"\nName: "+name+"\nBasic Salary: "+basicSalary);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println();
	}
	
	private void calaculateSalaryComponent() {
		hra = .4 * basicSalary;
		pf = .12 * basicSalary;
	}
	

}
