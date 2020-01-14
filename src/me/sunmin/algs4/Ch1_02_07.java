package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_02_07 {

	public static String mystery(String s) {
		int N = s.length();
		if (N <= 1) {
			return s;
		}
		return mystery(s.substring(N/2)) + mystery(s.substring(0, N/2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println(mystery("123456789"));
	}

}
