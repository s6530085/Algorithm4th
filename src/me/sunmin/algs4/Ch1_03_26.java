package me.sunmin.algs4;

public class Ch1_03_26 {
	
	public static void removeAll(Node<Integer> first, int key) {
		Node<Integer>last = null;
		while(first != null) {
			if (first.item == key) {
				first = first.next;
				if (last != null) {
					last.next = first;
				}
			}
			else {
				last = first;
				first = first.next;
			}
		}
	}

}
