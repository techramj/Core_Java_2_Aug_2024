# Assignment 02

      Assignment -02
          Employee
            id
            name
            salary
            hra = 40% of salary
            pf = 12% of salary
            da - 10% of salary
            bonus: constant = 500;
            incomeTax;  //home work
            
        
      
      slab: salary
      0 to 500000 then 0%
      500001 to 7.5 lakh then 5%
      7.5 to 10 lakh 10%
      above 10 lakh => 20%
      
      150000 ->
      0 - 5lakh = 0
      5 lakh to 7.5 = 2.5 *5% = 12500
      7.5 toi 10 lakh = 2.5 * 10 = 25000
      10 to 15 => 5 lakh => 5lakh % 20% = 1lakh
      
      500100=>
      
      netSalary = salary + hra + pf + bonus - incomeTax
        
      1. create class with above properties
      2. create default and parameterized costructor
      3. create getter setter 
      4. create display method , netSalary
      5. Create two object one with default Constructor and another with parameterized





      public class Employee {
	
	private int id;
	private String name;
	private double basicSalary;
	private double hra;  //40% of bs
	private double pf;   //12% of bs
	private double da;
	private final double bonus = 500;
	private double incomeTax;
	
	
	public Employee() {  //default constructor
	
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
		System.out.println("da: "+da);
		System.out.println("bonus: "+this.bonus);
		System.out.println("incomeTax: "+this.incomeTax);
		System.out.println();
	}
	
	private void calaculateSalaryComponent() {
		hra = .4 * basicSalary;
		pf = .12 * basicSalary;
		da =  .1 * basicSalary;
		
		//income logic
		double sal = basicSalary;
		double tax = 0;
		
		if(sal >= 1000000) {   
			tax = (sal - 1000000)*20/100;
			sal = 1000000;
		}
		
		if(sal>=750000) {
			tax = tax + (sal - 750000)*10/100;
			sal = 750000;
		}
		
		if(sal>=500000) {
			tax = tax + (sal - 500000)*5/100;
			sal = 500000;
		}
		
		this.incomeTax = tax;
	}
	
	public double netSalary() {
		return basicSalary  + pf + hra + da + bonus - incomeTax;
	}
	

}
