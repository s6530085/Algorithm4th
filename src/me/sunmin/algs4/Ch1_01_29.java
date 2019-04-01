package me.sunmin.algs4;

public class Ch1_01_29 {

	public static int rank(int[] a, int key) {
		int lo = 0;
		int hi = a.length-1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] >= key) {
				if (mid > lo) {
					if (a[mid-1] < key) {
						return mid-1;
					}
					else {
						hi = mid-1;
					}
				}
				else {
					return mid;
				}
			}
			else {
				if (mid < hi) {
					if (a[mid+1] > key) {
						return mid+1;
					}
					else {
						lo = mid+1;
					}
				}
				else {
					return mid+1;
				}
			}
		}
		return 0;
		
	}
	
	public static int count(int[] a, int key) {
		int lo = 0;
		int hi = a.length-1;
		while(lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (a[mid] == key) {
				int r = mid;
				while((r < a.length-1) && (a[r] == key)) {
					r++;
				}
				int l = mid;
				while((l <= 0) && (a[l] == key)) {
					l--;
				}
				return r-l+1;
			}
			else if (a[mid] > key) hi = mid-1;
			else lo = mid+1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		
	}
}
