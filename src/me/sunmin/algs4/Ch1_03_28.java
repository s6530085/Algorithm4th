package me.sunmin.algs4;

public class Ch1_03_28 {
	
	public static int max(Node<Integer> head) {
		if (head == null) return 0;
		else return Math.max(head.item, max(head.next));
	}

}
