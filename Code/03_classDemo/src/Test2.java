
public class Test2 {
	
	public static void main(String[] args) {
		Date d1 = new Date();
		d1.init(31, 10, 2024);
		Date next = d1.nextDate(d1);
		next.display();
		int dd = 31;
		int mm= 12;
		int yy = 2024;
		
		int dd1 ;
		int mm1;
		int yy1;
		
		switch (mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (dd == 31) {
				dd1 = 1;
				mm1 = mm + 1;
				if (mm1 > 12) {
					mm1 = 1;
					yy1 = yy + 1;
				} else {
					yy1 = yy;
				}
			} else {
				dd1 = dd + 1;
				mm1 = mm;
				yy1 = yy;
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (dd == 30) {
				dd1 = 1;
				mm1 = mm + 1;
			} else {
				dd1 = dd + 1;
				mm1 = mm;
			}
			yy1 = yy;
			break;

		default:
			if (dd == 28) {
				dd1 = 1;
				mm1 = mm + 1;
			} else {
				dd1 = dd + 1;
				mm1 = mm;

			}
			yy1 = yy;

		}
		
		System.out.println(dd+"-"+mm+"-"+yy);
		System.out.println(dd1+"-"+mm1+"-"+yy1);
	}

}
