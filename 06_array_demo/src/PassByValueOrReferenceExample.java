
public class PassByValueOrReferenceExample {
	
	
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before swapping, a= "+a+" b= "+b);
		swap(a, b); //a,b is called actual parameter
		/*int temp =a;
		a=b;
		b = temp;
		*/
		
		/*
		a = a+b;
		b = a-b;
		a = a-b;
		*/
		
		a = a+b -(b=a);
		
		
		System.out.println("After swapping, a= "+a+" b= "+b);
		
	}
	
	public static void swap(int a, int b) {  //a,b is called formal parameter
		int temp = a;
		a = b;
		b = temp;
	}

}
