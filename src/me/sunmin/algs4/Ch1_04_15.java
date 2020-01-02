package me.sunmin.algs4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stopwatch;

public class Ch1_04_15 {
	
	public static int TwoSum(int[] a) {
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < a.length-1; i++) {
			if(Arrays.binarySearch(a, i+1, a.length, -a[i]) >= 0) count++;
		}
		return count;
	}
	
	public static int TwoSumFast(int[] a) {
		Arrays.sort(a);
		int count = 0;
		for (int i = 0, j = a.length-1; i < j;) {
			if (a[i] + a[j] < 0) i++;
			else if (a[i] + a[j] > 0) j--;
			else {
				count++;
				i++;
				j--;
			}
		}
		return count;
	}
	
	public static int TwoSumFastFast(int[] a) {
		Set<Integer>set = new HashSet<Integer>();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (set.contains(-a[i])) count++;
			set.add(a[i]);
		}
		return count;
	}
	
	public static int ThreeSumFast(int[] a) {
		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < a.length - 2; i++) {
			for (int j = i+1, k = a.length-1;j < k;) {
				if (a[i] + a[j] + a[k] < 0) j++;
				else if (a[i] + a[j] + a[k] > 0) k--;
				else {
					count++;
					j++;
					k--;
				}
			}
		}
		return count;
	}
	
	
	public static void main(String[] args) {
		
		String p = "^(\\d+\\.)*\\d+$";
		String [] ss = {"10.2.2", "75.0.3770.100", "5.2.01", "2"};
		for (String s : ss) {
			System.out.println("match result is " + s.matches(p));
		}
		
		boolean b = 128==128;
		b = 127==127;
		int i = 100;
//		int[] onek = new In("src/me/sunmin/data/8Kints.txt").readAllInts();
//		Stopwatch w1 = new Stopwatch();
//		int i1 = TwoSum(onek);
//		StdOut.println("elapse " + w1.elapsedTime() + " second " + i1);
//		
//		int[] onek2 = new In("src/me/sunmin/data/8Kints.txt").readAllInts();
//		Stopwatch w2 = new Stopwatch();
//		int i2 = TwoSumFast(onek2);
//		StdOut.println("elapse " + w2.elapsedTime() + " second " + i2);
//
//		int[] onek3 = new In("src/me/sunmin/data/8Kints.txt").readAllInts();
//		Stopwatch w3 = new Stopwatch();
//		int i3 = TwoSumFastFast(onek3);
//		StdOut.println("elapse " + w3.elapsedTime() + " second " + i3);
	}
}
