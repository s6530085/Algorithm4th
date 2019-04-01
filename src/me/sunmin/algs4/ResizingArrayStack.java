package me.sunmin.algs4;

import java.util.Iterator;

public class ResizingArrayStack<Item> implements Iterable<Item>{
	
	private Item[] s = (Item[]) new Object[1];
	private int N = 0;

	private void resize(int n) {
		Item[] ns = (Item[]) new Object[n];
		for (int i = 0; i < N; i++) {
			ns[i] = s[i];
		}
		s = ns;
	}
	
	public Item pop() {
		Item temp = s[--N];
		s[N] = null;
		if (N > 0 && N == s.length/4) resize(s.length/2);
		return temp;
	}
	
	public void push(Item item) {
		s[N++] = item;
		if (N == s.length) resize(2*s.length);
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public static void main(String[] args) {
		

	}

	@Override
	public Iterator<Item> iterator() {
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<Item> {

		private int i = N;
		@Override
		public boolean hasNext() {
			return i > 0;
		}

		@Override
		public Item next() {
			return s[--i];
		}
		
	}

}
