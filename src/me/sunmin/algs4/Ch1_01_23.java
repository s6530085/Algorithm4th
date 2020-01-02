package me.sunmin.algs4;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

//import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_23 {
	
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length-1;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			if (a[mid] == key) return mid;
			else if (a[mid] > key) hi = mid-1;
			else lo = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] whilelist = new In(args[0]).readAllInts();
		Arrays.sort(whilelist);
		boolean printNotInWhile = true;
		if (args.length > 1) {
			if (args[1].equals("+")) {
				printNotInWhile = true;
			}
			else if (args[1].equals("-")) {
				printNotInWhile = false;
			}
		}
		while (!StdIn.isEmpty()) {
			int n = StdIn.readInt();
			boolean inWhile = (rank(n, whilelist) > -1);
			if ((printNotInWhile && !inWhile) 
				|| (!printNotInWhile && inWhile)) {
				StdOut.println(n);
			}
		}
		
	}

}
