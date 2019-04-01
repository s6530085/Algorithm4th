package me.sunmin.algs4;

import edu.princeton.cs.algs4.StdIn;

public class Ch1_03_15 {
	
	public String lastKString() {
		Queue<String>queue = new Queue<String>();
		int k = StdIn.readInt();
		while (!StdIn.isEmpty()) {
			String s = StdIn.readString();
			queue.enqueue(s);
			if (queue.size() > k) {
				queue.dequeue();
			}
		}
		return queue.dequeue();
	}
	

	public static void main(String[] args) {

	}

}
