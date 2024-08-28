package com.seed.model;

public class EnumDemo {
	
	public static void example1() {
		Employee emp1 = new Employee(1, "Jack", 5000, WeekDay.FRI);
		
		//WeekDay w1 = new WeekDay();  //new is not allowed in enum, inshort cannot create object of enum explicitly
	
		WeekDay w1 = WeekDay.SAT;
		System.out.println(w1);
		System.out.println(w1.ordinal());
		
		WeekDay[] arr = WeekDay.values();
		for(WeekDay w: arr) {
			System.out.println(w+"  ordinal="+w.ordinal()+"   toString():"+w.toString());
		}
	}
	
	public static void main(String[] args) {
		
		WeekDay1[] arr = WeekDay1.values();
		for(WeekDay1 day: arr) {
			System.out.println(day+" ordian="+day.ordinal()+"   index="+day.getIndex());
			System.out.println("isWeekEnd: "+day.isWeekend()+"   name="+day.getDay());
			System.out.println();
		}
		
		
		//convert String to enum
		WeekDay1 d1 = WeekDay1.valueOf("SUN");
		System.out.println(d1);
		
		WeekDay1 day1 = WeekDay1.getDay("friday");
		System.out.println(day1);
		
		
		System.out.println("-------\nWeekends are");
		for(WeekDay1 day: WeekDay1.getWeekend()) {
			System.out.println(day);
		}
		
		
	}

}
