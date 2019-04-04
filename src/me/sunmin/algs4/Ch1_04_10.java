package me.sunmin.algs4;

public class Ch1_04_10 {

	public static int BinarySearchLeftMost(int[] a, int key) {
		if (a[0] == key) return 0;
		int lo = 1;
		int hi = a.length-1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key && a[mid-1] != key) return mid;
			else if (a[mid] >= key) hi = mid-1;
			else lo = mid+1;
		}
		return -1;
	}
}
