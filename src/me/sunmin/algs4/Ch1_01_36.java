package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_01_36 {
	
	public static void arrange(int[] m) {
		for (int i = 0; i < m.length; i++) {
			m[i] = i;
		}
	}
	
	public static void shuffle(int[] m) {
		for (int i = 0; i < m.length; i++) {
			int temp = m[i];
			int index = StdRandom.uniform(i, m.length);
			// 1.1.37
//			int index = StdRandom.uniform(0, m.length);
			m[i] = m[index];
			m[index] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		int M = StdIn.readInt();
		int N = StdIn.readInt();
		int[] matrix = new int[M];
		int[][] result = new int[M][M];
		for (int i = 0; i < N; i++) {
			arrange(matrix);
			shuffle(matrix);
			for (int j = 0; j < M; j++) {
				int index = matrix[j];
				result[index][j]++;
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < M; j++) {
				StdOut.printf("%6d", result[i][j]);
			}
			StdOut.print("\n");
		}
	}
	

}
