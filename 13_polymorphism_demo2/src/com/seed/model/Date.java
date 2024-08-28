package com.seed.model;

public class Date {
	
	private int dd;
	private int mm;
	private int yy;
	
	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	public Date(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYy() {
		return yy;
	}

	public void setYy(int yy) {
		this.yy = yy;
	}
	
	@Override
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
	
	
	@Override
	public boolean equals(Object obj) {  //obj = d2 => compare this vs obj
		if(this == obj) {
			return true;
		}
		if(obj instanceof Date) {
			Date d = (Date)obj;
			return this.dd == d.dd && this.yy == d.yy && this.mm == d.mm;
		}
		return false;
	}
	

}
