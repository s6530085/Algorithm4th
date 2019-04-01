package me.sunmin.algs4;

public class Ch1_01_33 {
	
	public static double dot(double[]x, double[]y) {
		assert(x.length == y.length);
		double d= 0;
		for (int i = 0; i < x.length; i++) {
			d += x[i] * y[i];
		}
		return d;
	}

	
	public static double[][] mult(double[][]x, double[][]y) {
		assert(x[0].length == y.length);
		double[][] r = new double[x.length][y[0].length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y[0].length; j++ ) {
				for (int k = 0; k < x[0].length; k++) r[i][j] += x[i][k] * y[k][j];
			}
		}
		return r;
	}
	
	public static double[][] transpose(double[][]x) {
		double[][]r = new double[x[0].length][x.length];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[0].length; j++) {
				r[j][i] = x[i][j];
			}
		}
		return r;
	}
	
	public static double[] mult(double[][]x, double[]y) {
		assert(x[0].length == y.length);
		double[]r = new double[y.length];
		
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < x.length; j++) r[i] += y[i] * x[i][j];
		}
		
		return r;
	}
	
	public static double[] mult(double[]x, double[][]y) {
		assert(x.length == y[0].length);
		double[] r = new double[x.length];
		for (int i = 0; i < r.length; i++) {
			for (int j = 0; j < x.length; j++) r[i] = x[i] * y[i][j];
		}
		
		return r;
	}
}
