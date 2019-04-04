package me.sunmin.algs4;

import java.util.Arrays;

public class Ch1_04_20 {
	
	public static int biforceSearch(int[] a,int begin, int end, int key) {
		if (begin > end) return -1;
		int mid = begin + (end - begin) / 2;
		if (a[mid] == key) return mid;
		if (mid == 0 || mid == a.length-1 || mid == begin) return -1;
		if (a[mid-1] < a[mid])  {
			int bi = Arrays.binarySearch(a, begin, mid-1, key);
			if (bi >= 0) return bi;
			else return biforceSearch(a, mid+1, end, key);
		}
		else {
			int bi = Arrays.binarySearch(a, mid+1, end, key);
			if (bi >= 0) return bi;
			else return biforceSearch(a, begin, mid-1, key);
		}
	}

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9,8,6,4,2};
		int index = biforceSearch(a, 0, a.length-1, -5);
	}

}
