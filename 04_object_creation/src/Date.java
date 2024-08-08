
public class Date {
	
	private int dd;
	private int mm;
	private int yy;
	
	public Date(){ //constructor
		System.out.println("Default construtor called");
		dd = 1;
		mm = 1;
		yy = 2000;
	}
	
	public Date(int d, int m, int y) {
		System.out.println("Parameterized constructor method called...");
		dd = d;
		mm = m;
		yy = y;
	}
	

	public void display() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
	
	public void setDd(int d) {
		//logic
		dd = d;
	}
	
	public int getDd() {
		return dd;
	}
	

}
