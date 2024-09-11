package com.seed;

//@MyAnno2
@MyAnno1(message = "This is date class")
public class Date {

	//@MyAnno2
	private int dd;
	private int yy;
	
	//@MyAnno2
	private int mm;

	// default constructor
	@MyAnno2
	@MyAnno1(message = "default construtor")
	public Date() {
	}

	//@MyAnno2
	//parameterizied construtor
	@MyAnno1(message= "parameterized construtor")
	public Date(int dd, int yy, int mm) {
		super();
		this.dd = dd;
		this.yy = yy;
		this.mm = mm;
	}
	
	@MyAnno2
	public void foo() {
		
	}

}
