package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_12 {
	
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = 9-i;
		}
		for (int i = 0; i < 10; i++) {
			a[i] = a[a[i]];
		}
		for (int i : a) {
			StdOut.println(i);
		}
	}

}
