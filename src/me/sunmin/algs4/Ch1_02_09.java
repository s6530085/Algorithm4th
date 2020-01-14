package me.sunmin.algs4;

import edu.princeton.cs.algs4.Counter;

public class Ch1_02_09 {
	
	public static int rank(int[] a, int key, Counter c) {
		c.increment();
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) return mid;
			else if (a[mid] > key) hi = mid - 1;
			else lo = mid + 1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Counter c = new Counter("binary search");
		

	}

}
