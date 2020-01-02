package me.sunmin.algs4;

public class Ch1_04_22 {
	
	public static int fibonacciSearch(int[] a, int key) {
		int lo = 0;
		int hi = a.length-1;
		while (lo <= hi) {
			int f0 = 0;
			int f1 = 1;
			while (lo + f1 <= hi) {
				int temp = f1;
				f1 = f0 + f1;
				f0 = temp;
			}
			int mid = lo+f0;
			if (a[mid] == key) {
				return mid;
			}
			else if (a[mid] > key) {
				hi = mid-1;
			}
			else {
				lo = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] a = {1,3,5,7,9,11,13,15,17,19};
		int i = fibonacciSearch(a, 17);
	}

}
