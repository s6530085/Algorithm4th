package me.sunmin.algs4;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class CH1_02_02 {
 
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		Interval1D[] ds = new Interval1D[N];
		for (int i = 0; i < N; i++) {
			double d1 = StdIn.readDouble();
			double d2 = StdIn.readDouble();
			Interval1D d = new Interval1D(d1, d2);
			ds[i] = d;
		}
		
		for (int i = 0; i < N - 1; i++) {
			for (int j = i+1; j < N; j++) {
				if (ds[i].intersects(ds[j])) {
					StdOut.println(ds[i] + " insect " + ds[j]);
				}
			}
		}
		
	}

}
