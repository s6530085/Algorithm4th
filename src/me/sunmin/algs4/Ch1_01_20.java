package me.sunmin.algs4;

public class Ch1_01_20 {
	public static double lg(int n) {
		if (n == 1) return 0;
		return Math.log(n) + lg(n-1);
	}
}
