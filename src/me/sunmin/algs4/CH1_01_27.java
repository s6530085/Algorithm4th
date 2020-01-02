package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class CH1_01_27 {
	private static int count = 0;
	
	public static double binomial(int N, int k, double p) {
		count++;
		if (N == 0 && k == 0) return 1.0;
		if (N < 0 || k < 0) return 0.0;
		return (1.0-p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binomial(3,4, 0.5);
		StdOut.println(count);
	}

}
