package me.sunmin.algs4;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stack<Item> implements Iterable<Item> {
	
	private class Node {
		Node next;
		Item item;
	}
	
	private Node first;
	private int N;
	
	public void push(Item item) {
		Node oldFirst = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Item pop() {
		Item p = first.item;
		first = first.next;
		N--;
		return p;
	}
	
	public Item peek() {
		Item p = first.item;
		return p;
	}

	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator<Item>();
	}
	
	private class StackIterator<Item> implements Iterator<Item> {

		Node current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item t = (Item) current.item;
			current = current.next;
			return t;
		}
		
	}
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		while(!StdIn.isEmpty()) {
			String s = StdIn.readString();
			if (s.equals("-")) {
				if(!stack.isEmpty()) StdOut.print(stack.pop() + " ");
			}
			else {
				stack.push(s);
			}
		}
		StdOut.println("( " + stack.size() + " left on stack");
	}

}
