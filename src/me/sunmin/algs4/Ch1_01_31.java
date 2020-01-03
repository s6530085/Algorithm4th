package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_01_31 {
	
	public static void randomLink(int N, double p) {
		StdDraw.circle(0.5, 0.5, .5);
		double angel = 2*Math.PI/N;
		double dd = StdDraw.getPenRadius();
		StdDraw.setPenRadius(0.05);
		for (int i = 0; i < N; i++) {
			double dx = 0.5+Math.sin(angel*i)/2;
			double dy = 0.5+Math.cos(angel*i)/2;
			StdDraw.point(dx, dy);
		}
		StdDraw.setPenRadius(dd);
		StdDraw.setPenColor(StdDraw.GRAY);
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (StdRandom.bernoulli(p)) {
					StdDraw.line(0.5+Math.sin(angel*i)/2, 0.5+Math.cos(angel*i)/2,
							0.5+Math.sin(angel*j)/2, 0.5+Math.cos(angel*j)/2);
				}
 			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = StdIn.readInt();
		double p = StdIn.readDouble();
		randomLink(N, p);
	}

}
