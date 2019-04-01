package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdIn;

public class Ch1_01_24 {

	public static int gcd(int p, int q) {
		System.out.printf("p is %d, q is %d\n", p, q);
//		if (q > p) return gcd(q, p);
		if (q == 0) return p;
		int r = p % q;
		return gcd(q, r);
	}
	
	public static void main(String[] args) {
		int p = StdIn.readInt();
		int q = StdIn.readInt();
		int r = gcd(p, q);
		System.out.println("gcd is "+ r);
	}
}
