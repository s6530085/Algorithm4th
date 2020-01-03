package me.sunmin.algs4;

import java.util.Arrays;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ch1_01_39 {
	
	

	public static void main(String[] args) {
		int T = StdIn.readInt();
		int[] ns = {1000,10000,100000,1000000};
		for (int size : ns) {
			int same = 0;
			for (int i = 0; i < T; i++) {
				int[] a1 = new int[size];
				int[] a2 = new int[size];
				for (int j = 0; j < size; j++) {
					a1[j] = 100000 + StdRandom.uniform(900000);
					a2[j] = 100000 + StdRandom.uniform(900000);
				}
				Arrays.sort(a1);
				for (int k : a2) {
					if (BinarySearch.indexOf(a1, k)>=0) {
						same++;
					}
				}
			}
			
			StdOut.println(T + " experments " + size + " objects array have same count is " + (double)same/T);
		}
		

	}

}
