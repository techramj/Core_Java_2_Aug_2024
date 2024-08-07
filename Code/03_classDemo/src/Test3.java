
public class Test3 {

	public static void main(String[] args) {
		int dd = 28;
		int mm= 2;
		int yy = 2024;
		
		int dd1 = dd+1 ;
		int mm1 = mm;
		int yy1 = yy;
		
		switch (mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dd1 > 31) {
				dd1 = 1;
				mm1 = mm + 1;
				if (mm1 > 12) {
					mm1 = 1;
					yy1 = yy + 1;
				}
			} 
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (dd1 > 30) {
				dd1 = 1;
				mm1 = mm + 1;
			}
			break;

		default:
			if (dd1 > 28) {
				dd1 = 1;
				mm1 = mm + 1;
			} 
		}
		
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.println(dd1+"-"+mm1+"-"+yy1);
		
	}
}
