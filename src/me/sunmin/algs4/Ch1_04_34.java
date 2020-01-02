package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdRandom;

public class Ch1_04_34 {
	
	private int target;
	private int lastGuess = -1;;
	public Ch1_04_34(int n) {
		target = StdRandom.uniform(n) + 1;
	}
	
	public int guess(int i) {
		if (i == target) return 0;
		else {		
			int r = Math.abs(i-target) < Math.abs(lastGuess-target) ? 1 : -1;
			lastGuess = i;
			return r;
		}
	}
	
	
	public static void main(String[] args) {
		int n = 100;
		Ch1_04_34 g = new Ch1_04_34(n);
		int gu = n/2;
		int r = g.guess(gu);
		if (r == 0) return;
		int space = gu/2;
		while (space > 0) {
			r = g.guess(gu-space);
			if (r == 0) return;
			else if (r > 0) {
				gu = gu - space;
			}
			else {
				int temp = gu + space;
				r = g.guess(temp);
				if (r == 0) return;
				else if (r > 0) {
					gu = temp;
				}
				else {
					
				}
			}
			space = space/2;
		}
	}

}
