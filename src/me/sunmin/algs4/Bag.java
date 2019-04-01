package me.sunmin.algs4;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item> {

	private class Node {
		Node next;
		Item item;
	}
	
	private Node first;
	private int N;
	
	public void add(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next =oldFirst;
		N++;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	@Override
	public Iterator<Item> iterator() {
	
		return new BagIterator();
	}
	
	private class BagIterator implements Iterator<Item> {

		private Node current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item t = current.item;
			current = current.next;
			return t;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	

}
