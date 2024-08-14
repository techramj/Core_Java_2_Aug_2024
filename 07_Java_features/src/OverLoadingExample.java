
public class OverLoadingExample {
	public static void main(String[] args) {
		Math ob = new Math();
		ob.add();
		ob.add(10,20,30);
		ob.add(10,20,40,50);
		ob.add(10l,20l);
		ob.add(10,20,30,40,50,60);
		
		float a = 10;
		long b = 2l;
		float c = 1l;
		int d = 4;
		double e = 1.2f;
		double f = 2l;
		
	}
}
