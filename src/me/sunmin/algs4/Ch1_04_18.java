package me.sunmin.algs4;

public class Ch1_04_18 {
	public static int partialSmallest(int[] A) {
		if (A == null || A.length == 0) return -1;
		if (A.length == 1 || A[0] < A[1]) return 0;
		if (A[A.length-2] > A[A.length-1]) return A.length-1;
		int lo = 1;
		int hi = A.length - 2;
		while(lo <= hi) {
			int mid = lo + (hi - lo)/2;
			int midV = A[mid];
			if (midV < A[mid+1] && midV < A[mid-1]) {
				return mid;
			}
			else if (mid < A[mid+1]) {
				hi = --mid;
			}
			else {
				lo = ++mid;
			}
		}
		return lo;
	}
}
