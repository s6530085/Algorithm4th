package me.sunmin.algs4;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_01_28 {
	
	public static int[] removeDuplicate(int[] a) {
		if (a.length == 0) return a;
		
		int distince = 1;
		int lastIndex = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[lastIndex]) {
				distince++;
				lastIndex = i;
			}
		}
		int[] b = new int[distince];
		int ib = 0;
		b[ib++] = a[0];
		lastIndex = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a[lastIndex]) {
				b[ib++] = a[i];
				lastIndex = i;
			}
		}
		return b;
	}
	
	public static int[] geneSortedArray() {
		int n = StdRandom.uniform(100);
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = StdRandom.uniform(n);
		}
		Arrays.sort(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = geneSortedArray();
		for (int i : a) {
			StdOut.printf("%3d", i);
		}
		StdOut.println();
		int[] b = removeDuplicate(a);
		for (int i : b) {
			StdOut.printf("%3d", i);
		}
	}

}
