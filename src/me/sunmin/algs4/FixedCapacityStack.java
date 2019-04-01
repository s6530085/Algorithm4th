package me.sunmin.algs4;

import java.util.Iterator;

public class FixedCapacityStack<Item> implements Iterable{

	private Item[] s;
	private int N;
	
	public FixedCapacityStack(int num) {
		@SuppressWarnings("unchecked")
		Item[] items = (Item[])new Object[num];
		s = items;
	}
	
	public Item pop() {
		Item temp = s[--N];
		s[N] = null;
		return temp;
	}
	
	public void push(Item item) {
		s[N++] = item;
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
	
	public static void main(String[] args) {

	}
}
