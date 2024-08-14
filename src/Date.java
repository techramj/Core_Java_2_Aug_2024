
public class Date {
	
	int dd;
	int mm;
	int yy;
	
	public Date() {

	}

	public Date(int dd, int mm, int yy) {
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	@Override
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
	
	

}
