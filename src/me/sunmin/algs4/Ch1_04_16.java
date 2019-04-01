package me.sunmin.algs4;

import java.util.Arrays;

public class Ch1_04_16 {
	
	public static double nearestOfTwo(double[] D) {
		Arrays.sort(D);
		double nearest = Math.abs(D[0] - D[1]);
		for (int i = 1; i < D.length-1; i++) {
			nearest = Math.min(nearest, Math.abs(D[i] - D[i-1]));
		}
		return nearest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
