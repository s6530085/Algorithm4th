package me.sunmin.algs4;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_02_01 {
	
	public static double minDistanceInNPoint(int N) {
		Point2D[] points = new Point2D[N];
		for (int i = 0; i < N; i++) {
			double x = StdRandom.uniform();
			double y = StdRandom.uniform();
			Point2D point = new Point2D(x, y);
			points[i] = point;
		}
		
		double min = Double.MAX_VALUE;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i+1; j < N; j++) {
				double distance = points[i].distanceTo(points[j]);
				if (distance < min) {
					min = distance;
				}
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int N = StdIn.readInt();
		StdOut.println("the min distance is " + Ch1_02_01.minDistanceInNPoint(N));

	}

}
