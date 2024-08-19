package pkg2;

public class Test4 {
	
	public static void main(String[] args) {
		//A ob1 = new A(); //no default constructor
		
		A ob2 = A.getInstance();
		System.out.println(ob2);
	}

}
