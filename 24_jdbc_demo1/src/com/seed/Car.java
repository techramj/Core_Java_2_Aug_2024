package com.seed;

import java.util.List;

public class Car {
	
	private String regirstrationNumber;
	private String name;
	private String chasisNumber;
	private Engine engine;
	private List<Wheel> wheels;
	
}

class Engine{
	private String engineNo;
	private String type;
	private String fuelType;
}

class Wheel{
	private String productNumber;
}
