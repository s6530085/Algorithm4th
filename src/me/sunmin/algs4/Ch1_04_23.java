package me.sunmin.algs4;

public class Ch1_04_23 {

	public static int fractionBinarySearch(double[] d, double key) {
		int lo = 0;
		int hi = d.length-1;
		double dd = 1.0/d.length*d.length;
		while (lo <= hi) {
			int di = lo + (hi - lo) / 2;
			if (Math.abs(d[di] - key) < dd) return di;
			else if (d[di] > key) hi = di-1;
			else lo = di+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
