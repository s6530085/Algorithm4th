package me.sunmin.algs4;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_01_11 {

	public static boolean[][] geneRandomBool() {
		int row = StdRandom.uniform(5, 20);
		int col = StdRandom.uniform(5, 20);
		boolean[][] bs = new boolean[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				bs[i][j] = StdRandom.bernoulli(0.5);
			}
		}
		return bs;
	}
	
	
	public static void outputBooleanMatrix(boolean[][] bs) {
		int row = bs.length;
		int col = bs[0].length;
		StdOut.print("  ");
		for (int i = 0; i < col; i++) {
			StdOut.printf("%2d", i+1);
		}
		StdOut.print("\n");
		for (int i = 0; i < row; i++) {
			StdOut.printf("%2d", i+1);
			for (int j = 0; j < col; j++) {
				String s = " ";
				if (bs[i][j]) {
					s = "*";
				}
				StdOut.printf("%2s", s);
			}
			StdOut.print("\n");
		}
		
	}
	
	public static void main(String[] args) {
		Bag<Integer> bag = new Bag<Integer>();
		for (int i : bag) {
			
		}
		outputBooleanMatrix(geneRandomBool());
	}
}
