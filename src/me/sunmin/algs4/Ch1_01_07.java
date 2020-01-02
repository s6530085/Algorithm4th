package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_07 {

	public static void main(String[] args) {
		StdOut.print("" + 3 + 9);
		double t = 9.0;
		while (Math.abs(t - 9.0/t) > .001) 
			t = (t + 9.0/t)/2;
		StdOut.printf("%.5f\n", t);
		
		int sum = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < i; j++) {
				sum++;
			}
		}
		StdOut.printf("%d\n", sum);
		
		sum = 0;
		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < 1000; j++) {
				sum++;
			}
		}
		StdOut.printf("%d\n", sum);
	}

}
