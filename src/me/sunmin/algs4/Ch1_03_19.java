package me.sunmin.algs4;
import me.sunmin.algs4.Node;

public class Ch1_03_19 {
	
	public static void deleteTail(Node first) {
		Node last = null;
		while (first.next != null) {
			last = first;
			first = first.next;
		}
		if (last != null) last = last.next;
		else first = null;//should be link.first = null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
