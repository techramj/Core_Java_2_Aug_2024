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









# Assignment -02
   1. reverse the number. 123 => 321.
   2. check whether the string is palindrome
   3. print first n fibbonaci terms
   4. fibbonaci using recursion
   5. highest prime number nearest to the given number
        eg:  8  => 7
             5 => 3, 7 print the min number ans => 3
             25 => 23

         three method:
           nearestPrimeNumber(int num)
           nextPrmeNumber(int num)
           prviousPrimeNumber(int num)

         in a single method: nearestPrimeNumber(int num)
   
   
# Assignment -03
create an array of any size and assing some random number
int[] arr = {10,5,6,23,2,56};

1. find the  highest number
2. find the lowest number
3. find the 2nd highest number 
4. find the 3rd highest number
5. avg of an array

## solution
	
	public class ArrayUtil {
		
	   public static int getHighestNumber(int[] arr) { //10,20,3,4,22,34,1
		   int max = arr[0];
		   for(int i=1;i<arr.length;i++) {
			   if(arr[i]> max) {
				   max = arr[i];
			   }
		   }
		
			return max;
		}
		
		public static int getLowesttNumber(int[] arr) {
			
			int min = arr[0];
			   for(int i=1;i<arr.length;i++) {
				   if(arr[i] < min) {
					   min = arr[i];
				   }
			   }
			
				return min;
		}
		
	    public static int getSecondHighestNumber(int[] arr) {  //10,20,x,4,22,34,1
	    	
	    	int num1;
	    	int num2;
	    	
	    	//assume num1 is 1st and num2 is the 2nd highest
	    	
	    	if(arr[0]> arr[1]) {
	    		num1 = arr[0];
	    		num2 = arr[1];
	    	}else {
	    		num2 = arr[0];
	    		num1 = arr[1];
	    	}
	    	
	    	for(int i=2;i<arr.length;i++) {
	    		if(arr[i]> num1 && arr[i]> num2) {
	    			num2 = num1;
	    			num1 = arr[i];
	    		}else if(arr[i]> num2 && arr[i]<num1) {
	    			num2 = arr[i];
	    		}
	    	}
			
			return num2;
		}
	    
	    public static int getThirdHighestNumber(int[] arr) {
			
			return 0;
		}
	    
	    public static double avg(int[] arr) {
			
			return 0;
		}
	    
	    public static void printNumberRepeatedInAnArray(int[] arr) {//2,3,2,3,4,4,5,5,6,1,2,1,0,0,1
	    	
	    	int[] barr = new int[10];
	    	
	    	for(int i=0;i<arr.length;i++) {
	    		barr[arr[i]]++;  //barr[2]++
	    	}
	    	
	    	for(int i=0;i<barr.length;i++) {
	    		System.out.println(i+"="+barr[i]);
	    	}
	    		
	    }
	
	}

# Assignment 04
	1.  create array of size 2 and write a method to swap the value .
	   	arr[0] = 10
	        arr[1] = 20;
	    then when you call swap method, in main method the value of arr[0] and arr[1] should be swapped.
	
	2. overload method add. Create class Math
	   add(int, int)
	   add(float, float)
	   add(double, double)
	   add(long, long)
	   add(short, short)
	   add(byte,byte)
	   and check
	   add(1,2) call which method. if that method is commented then which will be the next method.
	   repeat the step and find the order in which method will be called.
	
	3. create class Algebra and implement below method
	   long add(int, int, int...args)
	   long multiply(int,int, int ... args)

        4. Write the program to print the number and their count.
		long num = 123453300423l;
		    0=2
		    1=1
		    2=2
		    3=4
		    4=2
		    5=1
	   
	
	Note whenever you will iterate the array, use enhanced for loop.

 # Assignment 06
 	create three package pkg1 , pkg2, pkg3.
  	pkg1
   	  	Date
	            int dd;
		    int mm;
		    int yy;
        pkg2
	  	Employee
	             int id;
		     String name;
	             double salary;
		     Date doj;  //containment
             
            id should be auto generated
	    write the method which will return total number of employees.

        pkg3
          Main
	   create two object of Employee.
           Test the four access specifier

# Assignment 07
	Employee
 		id
   		name
     		salary
		netSalary()
  		display(): print the details of employee


 	SalesPerson extends Employee
  		salesMade
    		commission
      		netSalary() : override
	        display(): override
	 	calculatCommission(): special method

        SalesManager extends SalesPerson
		noOfSubordinate
  		bonus
    		netSalary(): override
		display(): override
  		calcualteBonus() : special method


   ## In the main method
   	1. create the object of Employee, SalesPerson, SalesManager
    	2. mention which constructor will be called first, argange in the order
     	3. use the super construcotr
      	4. user the super keyword to use the sane behaviour of super class
        5. what we need to do, to avoid overriding of display method of Employee
	6. whant change you will do so that no one can extends SalesManager ?

 # Assignment 8
 	1. create class Date
  	2. override object method
   		a. toString
     		b. hashCode  // same object should always have same hashCode
       		c. finalize
	 	d. can we override getClass() method ?


# Assignment 9
  1. Create Employee , WageEmployee, SalesPerson, SalesManager class as discussed in previous session.
  2. Array of an Employee (let the size of array = 5)
  3. populate the array  with Employee , SM, SP, WE object
  4. method to display details of employees in an array
  5. details
     	 display the value of properties
         netSalary
         variable(in case of WE)
         bonus(SM)
         commission (SP)

  6. create one interface Printable and implement Printable to Employee class

   	public class EmployeeTest {

		public static void main(String[] args) {
			Employee emp1 = new Employee(1, "Jack", 5000);
	
			WageEmployee emp2 = new WageEmployee(2, "Jessica", 6000, 30, 10);
	
			SalesPerson emp3 = new SalesPerson(3, "Sam", 4000, 300000, 1);
			
			Employee[] empArr = new Employee[5];
			empArr[0] = new Employee(1, "Jack", 5000);
			empArr[1] = emp2;
			empArr[2] = emp3;
			empArr[3] = new WageEmployee(4, "Jay", 6000, 30, 10);
			empArr[4] = new SalesPerson(5, "Sama", 4000, 300000, 1);
			
			
			//printDetails(emp1);
			//printDetails(emp2);
			//printDetails(emp3);
			
			printDetails(empArr);
		}
		
		
		public static void printDetails(Employee[] arr) {
			for(Employee emp: arr) {
				printDetails(emp);
			}
		}
		
		
		public static void printDetails(Employee emp ) {
			System.out.println("Details of Employee: "+ emp.getName());
			System.out.println("-------------------------------------");
			System.out.println(emp.getClass().getSimpleName());
			System.out.println(emp);
			System.out.println("Net salary: "+emp.getSalary());
			if(emp instanceof WageEmployee) {
				double variable = ((WageEmployee)emp).getVariable();
				System.out.println("Variable pay: "+variable);
			}
			
			if(emp instanceof SalesPerson) {
				double comm = ((SalesPerson)emp).getCommsission();
				System.out.println("Commission: "+comm);
			}
			System.out.println("\n");
		}
            }



# Assignment 10
1. create abstract class Shape
2. create sub class Rectangle, Circle, Triangle, Square
3. write one method to display the details of Shape

   
  
	
  		

     
 	   
     		

















     

   
   
   
   
	
