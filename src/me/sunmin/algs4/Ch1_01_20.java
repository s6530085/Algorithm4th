package me.sunmin.algs4;

public class Ch1_01_20 {
	public static double lg(int n) {
		if (n == 1) return 0;
		return Math.log(n) + lg(n-1);
	}
	
	public static double H(int n) {
		double sum = 0;
		for (double i = 1; i < n; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	
	
	public static double sqrt(double c) {
		if (c < 0) return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(c/t-t) > err*t) {
			t = (c/t+t)/2;
		}
		
		return t;
	}
	
	public static void main(String[] args) {

		
	}
}
