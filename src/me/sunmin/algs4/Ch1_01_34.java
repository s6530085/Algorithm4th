package me.sunmin.algs4;

import java.util.Arrays;
import java.util.Collections;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_34 {
	
	public static void printMaxAndMin() {
		double max;
		double min;
		max = min = StdIn.readDouble();
		while (!StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			if (d > max) {
				max = d;
			}
			if (d < min) {
				min = d;
			}
		}
		StdOut.printf("max is %f, min is %f\n", max, min);
	}
	
	public static void printMid() {
		double[] ds = StdIn.readAllDoubles();
		Arrays.sort(ds);
		if (ds.length%2==0) {
			StdOut.printf("mid is %f", (ds[ds.length/2-1] + ds[ds.length/2])/2);
		}
		else {
			StdOut.printf("mid is %f", ds[ds.length/2]);
		}
	}
	
	public static void printKthMin(int k) {
		double[] ds = new double[k];
		Arrays.fill(ds, Double.POSITIVE_INFINITY);
		while(!StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			for (int i = 0; i < k; i++) {
				if (d < ds[i]) {
					for (int j = k-1; j > i; j--) {
						ds[j] = ds[j-1];
					}
					ds[i] = d;
					break;
				}
			}
		}
		StdOut.printf("k th min is %f", ds[k-1]);
	}
	
	public static void printMean() {
		int n = 0;
		double sum = 0;
		while (!StdIn.isEmpty()) {
			sum += StdIn.readDouble();
			n++;
		}
		StdOut.printf("mean is %f\n", sum/n);
	}
	
	public static void printLargeMeanPercent() {
		double[] ds = StdIn.readAllDoubles();
		double sum = 0;
		for (double d : ds) {
			sum += d;
		}
		double mean = sum / ds.length;
		int lm = 0;
		for (double d : ds) {
			if (d > mean) {
				lm++;
			}
		}
		StdOut.printf("large mean percentage is %.2f%%", (double)lm/ds.length);
	}
	
	
	
	public static void printSquareSum() {
		double ss = 0;
		while (!StdIn.isEmpty()) {
			double d = StdIn.readDouble();
			ss += d*d;
		}
		StdOut.printf("square sum is %f\n", ss);
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
