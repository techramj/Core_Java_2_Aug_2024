
public class Math {
	/*public void add(int a, int b) {
		System.out.println("int int");
	}*/
	
	public void add(String a, String b) {
		System.out.println("string string");
	}
	
	public void add(float a, float b) {
		System.out.println("float float");
	}
	
	/*public void add(long a, long b) {
		System.out.println("long log");
	}*/
	
	public void add(double a, double b) {
		System.out.println("double double");
	}
	
	public void add(int ...nums) { //variable argument
		System.out.print("varargs called=> ");
		/*for(int i=0;i<nums.length;i++) {
		    nums[i]=10;
			System.out.print(nums[i]+"  ");
		}*/
		
		for(int a : nums) {
			a = 10;
			System.out.print(a+" ");
		}
		
		System.out.println("");
	}
	
	public void add(int a, String b) {}
	

	public void add(String b, int a) {}
	
	public void add(int a, int b,int c ) {
		System.out.println("int int int");
	}
		
	
	
	public void add(int a, int b, int c, int d) {
		System.out.println("4 int");
	}
	
	
}
