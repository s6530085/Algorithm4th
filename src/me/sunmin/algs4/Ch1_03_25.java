package me.sunmin.algs4;

public class Ch1_03_25 {

	public static void insertAfter(Node n1, Node n2) {
		if (n1 != null && n2 != null) {
			n2.next = n1.next;
			n1.next = n2;
		}
	}
}
