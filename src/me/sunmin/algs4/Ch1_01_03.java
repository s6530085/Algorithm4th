package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_03 {
	
	private static String threeEqual(int i1, int i2, int i3) {
		if (i1 == i2 && i2 == i3) {
			return "equal";
		}
		else {
			return "not equal";
		}
	}
	
	public static void main(String[] args) {
//		int i1 = StdIn.readInt();
//		int i2 = StdIn.readInt();
//		int i3 = StdIn.readInt();
//		
//		StdOut.printf(threeEqual(i1, i2, i3));
		
		int index = "abc".indexOf(' ');
		String s = "abc".substring(0, index);
		StdOut.println(s);
	}
}
