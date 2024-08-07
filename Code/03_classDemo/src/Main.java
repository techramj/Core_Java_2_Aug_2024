
public class Main {
	
	public static void main(String[] args) {
		
		int a; //declare one variable, name of variable = a, type of variable=int
		a = 10; //initialize the value with 10
		
		//local variable memory allocated in stack
		
		System.out.println(a);  //cannot used variable which is not initialized
		
	
		//create the object => using new keyword
		Date d1;   //d1 is called reference
		d1 = new Date();
		
		//System.out.println("Date: "+d1.dd+"/"+d1.mm+"/"+d1.yy);
		d1.display();
		
		Date today = new Date();
		today.dd = 6;
		today.mm = 8;
		today.yy = 2024;
		
		//System.out.println("Today: "+today.dd+"/"+today.mm+"/"+today.yy);
		today.display();
		
		Date tomorrow = new Date();
		tomorrow.init(28, 2, 2025);
		tomorrow.display();
		
		
		Date anotherDate = tomorrow.nextDate(tomorrow);
		anotherDate.display();
		
		
		//Please do the lab
		//Create class Date and try to create 2 or 3 object using main method
		
	}

}
