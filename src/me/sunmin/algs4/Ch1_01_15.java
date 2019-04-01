package me.sunmin.algs4;

public class Ch1_01_15 {

	public static int[] histogram(int[] a, int M) {
		int[] r = new int[M];
		for (int i : a) {
			if (i < M) {
				r[i]++;
			}
		}
		return r;
	}
}
