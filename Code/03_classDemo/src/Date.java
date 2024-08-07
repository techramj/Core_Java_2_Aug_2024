
public class Date {
	//abstraction -> showing essential feature
	int dd;   //data member / instance member / object property
	int mm;
	int yy;
	
	void display() {
		System.out.println(dd+"-"+mm+"-"+yy);
	}
	
	void init(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	
	Date nextDate(Date d) { //31-10-2024
		Date newDate = new Date();
		newDate.dd =  d.dd +1;
		newDate.mm = d.mm;
		newDate.yy = d.yy;
		
		switch (d.mm) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if (d.dd == 31) {
				newDate.dd = 1;
				newDate.mm = mm + 1;
				if (newDate.mm > 12) {
					newDate.mm = 1;
					newDate.yy = yy + 1;
				} else {
					newDate.yy = yy;
				}
			} else {
				newDate.dd = dd + 1;
				newDate.mm = mm;
				newDate.yy = yy;
			}
			break;

		case 4:
		case 6:
		case 9:
		case 11:
			if (d.dd == 30) {
				newDate.dd = 1;
				newDate.mm = d.mm + 1;
			} else {
				newDate.dd = dd + 1;
				newDate.mm = d.mm;
			}
			newDate.yy = d.yy;
			break;

		default:
			if (d.dd == 28) {
				newDate.dd = 1;
				newDate.mm = d.mm + 1;
			} else {
				newDate.dd = d.dd + 1;
				newDate.mm = d.mm;

			}
			newDate.yy = d.yy;

		}
		
		
		
		
		
		
		
		return newDate;
	}

}
