package me.sunmin.algs4;

public class Ch1_01_13 {

	public static int[][] reverse(int[][] a) {
		int[][] b = new int[a[0].length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				b[j][i] = a[i][j];
			}
		}
		return b;
	}
	
}
