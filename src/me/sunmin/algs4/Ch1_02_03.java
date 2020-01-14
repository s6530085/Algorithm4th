package me.sunmin.algs4;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_02_03 {

	public static void main(String[] args) {
		int N = StdIn.readInt();
		double min = StdIn.readDouble();
		double max = StdIn.readDouble();
		assert min >= 0 && min <= 1;
		assert max >= 0 && max <= 1;
		assert max > min;
		StdDraw.setXscale(min, max);
		StdDraw.setYscale(min, max);
		Interval2D[] ds = new Interval2D[N];
		Point2D[] plbs = new Point2D[N];// 左下(left bottom)角点的坐标
		Point2D[] prts = new Point2D[N];// 右上(right top)角点的坐标
		for (int i = 0; i < N; i++) {
			double x1 = StdRandom.uniform(min, max);
			double x2 = StdRandom.uniform(min, max);
			double y1 = StdRandom.uniform(min, max);
			double y2 = StdRandom.uniform(min, max);
			Interval1D xi = new Interval1D(Math.min(x1, x2), Math.max(x1, x2));
			Interval1D yi = new Interval1D(Math.min(y1, y2), Math.max(y1, y2));
			Interval2D d = new Interval2D(xi, yi);
			ds[i] = d;
			d.draw();
			plbs[i] = new Point2D(xi.min(), yi.min());
			prts[i] = new Point2D(xi.max(), yi.max());
		}
		int insectCount = 0;
		int containCount = 0;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i+1; j < N; j++) {
				if (ds[i].intersects(ds[j])) {
					insectCount++;
				}
				if ((ds[i].contains(plbs[j]) && ds[i].contains(prts[j])) 
						|| (ds[j].contains(plbs[i]) && ds[j].contains(prts[i]))) {
					containCount++;
				}
			}
		}
		
	}

}
