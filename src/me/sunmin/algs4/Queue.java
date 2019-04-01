package me.sunmin.algs4;

import java.util.Iterator;

public class Queue<Item> implements Iterable<Item> {

	private class Node {
		Node next;
		Item item;
	}
	
	private Node first;
	private Node last;
	private int N;

	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		if (isEmpty()) first = last;
		else oldLast.next = last;
		N++;
	}
	
	
	public Item dequeue() {
		Node oldFirst = first;
		first = first.next;
		if (N == 1) last = null;
		N--;
		return oldFirst.item;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new QueueIterator();
	}

	private class QueueIterator implements Iterator<Item> {

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

	}
}
