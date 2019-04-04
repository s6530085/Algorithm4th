package me.sunmin.algs4;

import java.util.Iterator;

import edu.princeton.cs.algs4.StdRandom;

public class RandomBag<Item> implements Iterable<Item> {

	private int N;
	private Node<Item> first;
	
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void add(Item item) {
		Node<Item> oldFirst = first;
		first = new Node<Item>();
		first.item = item;
		first.next = oldFirst;
		N++;
	}

	@Override
	public Iterator<Item> iterator() {
		return new RandomBagIterator();
	}
	
	private class RandomBagIterator implements Iterator<Item> {

		private Node<Item>[] objects = null;
		private int i = 0;;
		public RandomBagIterator() {
			objects = (Node<Item>[]) new Object[N];
			int index = 0;
			Node<Item> current = first;
			while(current!=null) {
				objects[index++] = current;
				current = current.next;
			}
			for (int i = 0; i < N-1; i++) {
				Node<Item> temp = objects[i];
				int change = StdRandom.uniform(i, N);
				objects[i] = objects[change];
				objects[change] = temp;
			}
		}
		
		@Override
		public boolean hasNext() {
			return i < objects.length;
		}

		@Override
		public Item next() {
			return objects[i++].item;
		}
		
	}
	
}
