package me.sunmin.algs4;

public class Ch1_01_19 {
	
	private static long[] f = new long[100];
	public static long F(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		if (f[n] > 0) return f[n];
		long r= F(n-1) + F(n-2);
		f[n] = r;
		return r;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.printf("f %d is %d\n", i, F(i));
		}
	}
}
