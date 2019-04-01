package me.sunmin.algs4;

public class Ch1_01_30 {
	
	public static int gcd(int p, int q) {
		if (q == 0) return p;
		int r = p%q;
		return gcd(q, r);
	}
	
	public static boolean prime(int i, int j) {
		if (i < 2 || j < 2) return false;
		if (gcd(i, j) == 1) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		boolean[][] bs = new boolean[100][100];
		for (int i = 0; i < bs.length; i++) {
			for (int j = 0; j < bs[0].length; j++) {
				if (prime(i, j)) bs[i][j] = true;
			}
		}
	}

}
