package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_22 {

	public static int rank(int[] a, int key) {
		return rank(a, key, 0, a.length-1, 1);
	}
	
	public static int rank(int[] a, int key, int lo, int hi, int depth) {
		StdOut.println("lo is " + lo + " hi is " + hi + "depth is " + depth);
		int mid = lo + (hi - lo)/2;
		if (a[mid] == key) return mid;
		else if (a[mid] > key) return rank(a, key, lo, mid-1, depth+1);
		else return rank(a, key, mid+1, hi, depth+1);
	}
}
