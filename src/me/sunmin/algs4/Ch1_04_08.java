package me.sunmin.algs4;

import java.util.Arrays;

public class Ch1_04_08 {
	
	public static int samePairCount(int[] a) {
		Arrays.sort(a);
		int count = 0;
		int same = 1;
		for (int i = 1; i < a.length; i++) {
			if (a[i-1] == a[i]) same++;
			else {
				if (same > 1) {
					int pair = same * (same-1)/2;
					count += pair;
				}
				same = 1;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
