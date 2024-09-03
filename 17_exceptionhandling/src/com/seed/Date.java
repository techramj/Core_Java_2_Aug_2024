package com.seed;

import com.seed.exception.InvalidDateExcpetion;

public class Date implements Cloneable{

	private int dd;
	private int mm;
	private int yy;

	public Date() {
		// TODO Auto-generated constructor stub
	}

	public Date(int dd, int mm, int yy) {
		if (dd > 31) {
			// throw the exception => throw the object
			throw new InvalidDateExcpetion();
		}
		if (mm > 12) {
			throw new InvalidDateExcpetion("month must be within range of 1- 12. month=" + mm);
		}
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
		return dd + "/" + mm + "/" + yy;
	}
	
	
	@Override
	public Date clone() throws CloneNotSupportedException { //co variant return type
		return (Date)super.clone();
	}

}
