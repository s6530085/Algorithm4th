package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_16 {
	
	public static String exR1(int n) {
		if (n <= 0) return "";
		return exR1(n-3) + n + exR1(n-2) + n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print(exR1(6));
	}

}
