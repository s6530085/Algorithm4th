package me.sunmin.algs4;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_01_32 {

	public static void draw(int[] ds) {
		for (int i = 0; i < ds.length; i++) {
			int d = ds[i];
			double x = 1.0*i/ds.length;
			double y = d/2.0;
			double rw = 0.5/ds.length;
			double rh = d/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}
	
	public static void main(String[] args) {
		int N = StdIn.readInt();
		double l = StdIn.readDouble();
		double r = StdIn.readDouble();
		double space = (r-l)/N;
		double[] ds = StdIn.readAllDoubles();
		int[] sg = new int[N];
		for (double d : ds) {
			if (d >= l && d <= r) {
				int i = (int) ((d - l)/space);
				sg[i]++;
			}
		}
		draw(sg);
//		
//		int N = 5;
//		double[] a = new double[N];
//		for (int i = 0; i < N; i++) {
//			a[i] = StdRandom.random();
//		}
//		Arrays.sort(a);
//		for (int i = 0; i < N; i++) {
//			double x = 1.0*i/N;
//			double y = a[i]/2.0;
//			double rw = 0.5/N;
//			double rh = a[i]/2.0;
//			StdDraw.filledRectangle(x, y, rw, rh);
//		}
		
	}

}
