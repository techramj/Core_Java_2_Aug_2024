package com.seed.model.shape;

public class Square  extends Rectangle{
	
	private double side;
	
	public Square() {
	}
	
	public Square(double side) {
		super(side, side);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}

}
