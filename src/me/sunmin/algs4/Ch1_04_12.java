package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_04_12 {

	public static void printSame(int[] a, int[] b) {
		int ia = 0;
		int ib = 0;
		while(ia < a.length && ib < b.length) {
			if (a[ia] < b[ib]) ia++;
			else if (a[ia] > b[ib]) ib++;
			else {
				StdOut.print(a[ia]);
				while (ia < a.length && a[ia] == a[ia+1]) ia++;
				while (ib < b.length && b[ib] == b[ib+1]) ib++;
			}
		}
	}

}
