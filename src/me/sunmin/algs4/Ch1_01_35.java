package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_35 {

	
	
	public static void main(String[] args) {
		int SIDES = 6;
		double[] dist = new double[SIDES*2+1];
		for (int i = 1; i <= SIDES; i++) {
			for (int j = 1; j <= SIDES; j++) {
				dist[i+j] += 1.0;
			}
		}

		for (int i = 2; i <= 2*SIDES; i++) {
			StdOut.printf("dice is %d's pro is %.3f\n", i, dist[i]/36.0);
		}
	}

}
