package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_14 {
	
	public static double log(int base, int n) {
		return Math.log(n) / Math.log(base);
	}
	
	public static int log2(int n) {
		int lg = 0;
		while (n > 1) {
			n >>= 1;
			lg++;
		}
		return lg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = args[0];
		String s2 = args[1];
		String s3 = args[2];
		String s4 = args[3];
		StdOut.print(s1+" "+s2 + " " + s3 + " " + s4);
	}

}
