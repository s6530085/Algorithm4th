package me.sunmin.algs4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Ch1_04_14 {

	public static int FourSum(int[]a) {
		int count = 0;
		int l = a.length;
		for (int i = 0; i < l-3; i++) {
			for (int j = i+1; j < l-2; j++) {
				for (int k = j+1; k < l-1; k++) {
					int m = Arrays.binarySearch(a, k+1, l, -a[i]-a[j]-a[k]);
					if (m >= 0) count++;
				}
			}
		}
		
		return count;
	}
	
	public static int fourSum(int[] a) {
	    int len = a.length;
	    int cnt = 0;
	    for (int l = 0; l < len - 3; l++) {
	        for (int i = l + 1; i < len - 2; i++) {
	            for (int j = i + 1, k = len - 1; j < k;) {
	                if (a[l] + a[i] + a[j] + a[k] < 0) {
	                    j++;
	                } else if (a[l] + a[i] + a[j] + a[k] > 0) {
	                    k--;
	                } else {
	                    cnt++;
	                    j++;
	                    k--;
	                }
	            }
	        }
	    }
	    return cnt;
	}
	
	public static void main(String[] args) {
		Stopwatch w1 = new Stopwatch();
		int[] onek = new In("src/me/sunmin/data/1Kints.txt").readAllInts();
		Arrays.sort(onek);
		FourSum(onek);
		StdOut.println("elapse " + w1.elapsedTime() + " second");
		
		Stopwatch w2 = new Stopwatch();
		int[] one2k = new In("src/me/sunmin/data/2Kints.txt").readAllInts();
		FourSum(one2k);
		StdOut.println("elapse " + w2.elapsedTime() + " second");
		
		Stopwatch w4 = new Stopwatch();
		int[] one4k = new In("src/me/sunmin/data/4Kints.txt").readAllInts();
		FourSum(one4k);
		StdOut.println("elapse " + w4.elapsedTime() + " second");
		
		Stopwatch w8 = new Stopwatch();
		int[] one8k = new In("src/me/sunmin/data/8Kints.txt").readAllInts();
		FourSum(one8k);
		StdOut.println("elapse " + w8.elapsedTime() + " second");
	}
}
