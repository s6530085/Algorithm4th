package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

class SmartDate {
	private final String[] weekdays = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	private final int[] monthdays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private int month;
	private int day;
	private int year;
	
	private boolean isLeap(int thatYear) {
		if (thatYear % 400 == 0) return true;
		else if (thatYear % 100 == 0) return false;
		else if (thatYear % 4 == 0) return true;
		else return false;
	}
	
	SmartDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	String dayOfTheWeek() {
		int days = (year - 2000) * 365;
		for (int i = 2000; i < year; i++) {
			if (isLeap(i)) days++;
		}
		if (isLeap(year) && month > 2) {
			days++;
		}
		for (int i = 0; i < month-1; i++) {
			days += monthdays[i];
		}
		days += day - 1;
		return weekdays[days%7];
	}
}

public class Ch1_02_12 {

	
	
	public static void main(String[] args) {
		SmartDate d = new SmartDate(1, 14, 2020);
		StdOut.println("today is " + d.dayOfTheWeek());
	}

}
