
public class Test {
	
	static void example1() {
		System.out.println("start");
		Date d1 = new Date();
		
		
		//if you want to access the member, use . operator
		//d1.dd = 120;
		d1.display();
	}
	
	static void example2() {
		
	}
	
	public static void main(String[] args) {
		
		Date d = new Date();  //default constructor
		d.display();
		//d.Date(); //cannot called constructor explicitly
		
		
		Date d2 = new Date(10,10,2010);
		d2.display();
		
		
		//d.dd = 23; private member cannot be access outside the class
		//d2.mm = 10;
		
		d.setDd(123);
		d.display();
		
		System.out.println("dd ="+d.getDd());
	
		
	}
	
	 

}
