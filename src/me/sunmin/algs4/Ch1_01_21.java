package me.sunmin.algs4;

import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ch1_01_21 {

	
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer>scores1 = new ArrayList<Integer>();
		List<Integer>scores2 = new ArrayList<Integer>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			Integer i1 = StdIn.readInt();
			Integer i2 = StdIn.readInt();
			names.add(s);
			scores1.add(i1);
			scores2.add(i2);
		}
		for (int i = 0; i < names.size(); i++) {
			int i1 = scores1.get(i);
			int i2 = scores2.get(i);
			StdOut.printf("%s %d %d %.3f\n", names.get(i), i1, i2, (double)i1/i2);
		}
		
	}
}
