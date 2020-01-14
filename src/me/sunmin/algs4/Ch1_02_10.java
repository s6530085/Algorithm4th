package me.sunmin.algs4;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdDraw;

public class Ch1_02_10 {
	
	private class VisualCounter {
		private int count;
		private int op;
		
		public VisualCounter(int N, int max) {
			StdDraw.setXscale(0, N);
			StdDraw.setYscale(-Math.abs(max), Math.abs(max));
		}
		
		void increment() {
			count++;
			op++;
			StdDraw.point(op, count);
		}
		
		void decrement() {
			count--;
			op++;
			StdDraw.point(op, count);
		}
		
		int tally() {
			return count;
		}
		
		public String toString() {
			return "count is " + count;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c = new Counter("");
	}

}
