package me.sunmin.algs4;

public class FixedCapacityStackOfStrings {
	
	private String[] s;
	private int N;
	
	
	public FixedCapacityStackOfStrings(int num) {
		s = new String[num];
	}
	
	public void push(String e) {
		s[N++] = e;
	}
	
	public String pop() {
		return s[--N];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public boolean isFull() {
		return N == s.length-1;
	}
	
	public int size() {
		return N;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
