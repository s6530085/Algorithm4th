package me.sunmin.algs4;

import me.sunmin.algs4.Ch1_03_32.Node;

public class Ch1_03_30 {
	public static Node reverse(Node head) {
		Node current = head;
		Node last = null;
		while (current != null) {
			Node temp = current.next;
			current.next = last;
			last = current;
			current = temp;
		}
		
		return last;
	}
}
