package me.sunmin.algs4;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_38 {
	
	public static int brutalSearch(int key, int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == key) return i;
		}
		return -1;
	}
	
	public static int binarySearch(int key, int[] a) {
		int lo = 0;
		int hi = a.length-1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) return mid;
			if (a[mid] > key) hi = mid-1;
			else lo = mid+1;
		}
		return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] whilelist = new In("largeW.txt").readAllInts();
		int[] bills = new In("largeT.txt").readAllInts();
		Arrays.sort(whilelist);
		long startTime=System.currentTimeMillis();
		for (int i : bills) {
			int rank = binarySearch(i, whilelist);
		}
		long endTime=System.currentTimeMillis();
		StdOut.printf("binary search cast time %ld ms\n", endTime-startTime);
		
		startTime=System.currentTimeMillis();
		for (int i : bills) {
			int rank = brutalSearch(i, whilelist);
		}
		endTime=System.currentTimeMillis();
		StdOut.printf("brutal search cast time %ld ms\n", endTime-startTime);
	}

}
