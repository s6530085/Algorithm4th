package me.sunmin.algs4;

import java.util.Arrays;

public class StaticSETofInts {

	
	private int[]nums;
	public StaticSETofInts(int[] a) {
		nums = Arrays.copyOf(a, a.length);
		Arrays.sort(nums);
	}
	
	public boolean contains(int key) {
		return Arrays.binarySearch(nums, key) >= 0;
	}
	
	public int howMany(int key) {
		int index = Arrays.binarySearch(nums, key);
		if (index < 0) return 0;
		int many = 1;
		int left = index - 1;
		while(left >= 0) {
			if (nums[left] == key) {
				left--;
				many++;
			}
		}
		int right = index + 1;
		while(right < nums.length) {
			if (nums[right] == key) {
				right++;
				many++;
			}
		}
		return many;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
