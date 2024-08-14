
public class PassByValueExample {
	
	public static void main(String[] args) {
		Date d1 = new Date(1,1,2001);
		Date d2 = new Date(2,2,2002);
		System.out.println("Before swaping: ");
		System.out.println("d1="+d1);
		System.out.println("d1="+d2);
		swap(d1,d2);
		System.out.println("After swaping: ");
		System.out.println("d1="+d1);
		System.out.println("d1="+d2);
	}
	
	public static void swap(Date x, Date y) {
		//logic
		int temp;
		
		temp = x.dd;
		x.dd = y.dd;
		y.dd = temp;
		
		temp = x.mm;
		x.mm = y.mm;
		y.mm = temp;
		
		temp = x.yy;
		x.yy = y.yy;
		y.yy = temp;
	}

}
