package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_18 {

	public static int mystery(int a, int b) {
		if (b == 0) return 0;
		if (b % 2 == 0) return mystery(a+a, b/2);
		return mystery(a+a, b/2) + a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.println(mystery(2,25));
		StdOut.println(mystery(3,11));
	}

}
