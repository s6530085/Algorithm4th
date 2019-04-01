package me.sunmin.algs4;

import java.util.LinkedList;
import java.util.Queue;

public class Ch1_03_37 {

	public int Josephus(int n, int m) {
		Queue<Integer>queue = new LinkedList<Integer>();
		for (int i = 1; i <= n ; i++) {
			queue.offer(i);
		}
		int i = 1;
		while (queue.size() > 1) {
			int v = queue.poll();
			if (i == m) {
				i = 1;
			}
			else {
				queue.offer(v);
				i++;
			}
		}
		
		return queue.poll();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ch1_03_37 c = new Ch1_03_37();
		int i = c.Josephus(7, 2);
	}

}
