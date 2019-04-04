package me.sunmin.algs4;

import java.io.File;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class ThreeSum {

	public static int count(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length-2; i++) {
			for (int j = i+1; j < a.length-1; j++) {
				if (Arrays.binarySearch(a, j+1, a.length, -a[i]-a[j]) >0 ) count++;
//				for (int k = j+1; k < a.length; k++) {
//					if (a[i] + a[j] + a[k] == 0) count++;
//				}
				"aaa".substring(1);		
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Stopwatch w1 = new Stopwatch();
		int[] onek = new In("src/me/sunmin/data/1Kints.txt").readAllInts();
		count(onek);
		StdOut.println("elapse " + w1.elapsedTime() + " second");
		
		Stopwatch w2 = new Stopwatch();
		int[] one2k = new In("src/me/sunmin/data/2Kints.txt").readAllInts();
		count(one2k);
		StdOut.println("elapse " + w2.elapsedTime() + " second");
		
		Stopwatch w4 = new Stopwatch();
		int[] one4k = new In("src/me/sunmin/data/4Kints.txt").readAllInts();
		count(one4k);
		StdOut.println("elapse " + w4.elapsedTime() + " second");
		
		Stopwatch w8 = new Stopwatch();
		int[] one8k = new In("src/me/sunmin/data/8Kints.txt").readAllInts();
		count(one8k);
		StdOut.println("elapse " + w8.elapsedTime() + " second");
	}

}
