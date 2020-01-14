package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdOut;

public class Ch1_02_06 {

	public static boolean isCircularRotation(String s1, String s2) {
		return (s1.length() == s2.length()) && (s2 + s2).indexOf(s1) >= 0;
	}
	
	public static void main(String[] args) {
		
		boolean b = isCircularRotation("actgacg", "tgacgac");
		StdOut.println("isCircularRotation " + b);
	}

}
