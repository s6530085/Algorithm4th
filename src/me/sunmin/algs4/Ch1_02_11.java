package me.sunmin.algs4;

public class Ch1_02_11 {
	
	private class SmartDate {
		private int month;
		private int day;
		private int year;
		
		public SmartDate(int month, int day, int year) {
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day < 1 || day > 31) {
					throw new RuntimeException("wrong day");
				}
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day < 1 || day > 30) {
					throw new RuntimeException("wrong day");
				}
			}
			else if (month == 2) {
				if (day < 1 || day > 29) {
					throw new RuntimeException("wrong day");
				}
				else if (day == 29) {
					if (year % 4 != 0) {
						throw new RuntimeException("wrong day");
					}
					else if ((year % 100 == 0) && (year % 400 != 0)) {
						throw new RuntimeException("wrong day");
					}
				}
			}
			else {
				throw new RuntimeException("wrong month");
			}
			
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
