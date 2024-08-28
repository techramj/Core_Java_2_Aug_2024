package com.seed.model;

public enum WeekDay1 {
	SUN(1, true, "SUNDAY"), MON(2, false, "MONDAY"), TUE(3, false, "TUESDAY"), 
	WED(4, false, "WEDNESDAY"), THU(5, false, "THURSDAY"), FRI(6, true, "FRIDAY"), 
	SAT(7, true, "SATURDAY");
	
	private int index;
	private boolean isWeekend;
	private String day;
	
	private WeekDay1(int index,boolean isWeekend, String day) {
		this.index = index;
		this.isWeekend = isWeekend;
		this.day = day;
	}
	
	public String getDay() {
		return day;
	}
	
	public int getIndex() {
		return index;
	}
	
	public boolean isWeekend() {
		return isWeekend;
	}
	
	@Override
	public String toString() {
		return this.day;
	}
	
	public static WeekDay1 getDay(String day) {
		for(WeekDay1 w: WeekDay1.values()) {
			if(w.getDay().equalsIgnoreCase(day)) {
				return w;
			}
		}
		return null;
	}
	
	public static WeekDay1[] getWeekend() {
		int count =0;
		WeekDay1[]  days = WeekDay1.values();
		for(WeekDay1 w: days) {
			if(w.isWeekend) {
				count++;
			}
		}
		
		WeekDay1[] weekends = new WeekDay1[count];
		count =0;
		for(WeekDay1 w: days) {
			if(w.isWeekend) {
				weekends[count] = w;
				count++;
			}
		}
		
		return weekends;
	}
	
	
}
