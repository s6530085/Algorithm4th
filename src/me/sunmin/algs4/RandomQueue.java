package me.sunmin.algs4;

import java.util.Arrays;
import java.util.Iterator;

import edu.princeton.cs.algs4.StdRandom;

public class RandomQueue<Item> implements Iterable<Item> {
	
	
	private int N;
	private Item[] objects;
	
	public RandomQueue() {
		objects = (Item[]) new Object[1];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public void enqueue(Item item) {
		objects[N++] = item;
		if (N == objects.length) resize(N*2);
	}
	
	public Item dequeue() {
		int index = StdRandom.uniform(0, N);
		Item temp = objects[index];
		objects[index] = objects[N-1];
		objects[N-1] = null;
		N--;
		if (N > 0 && N == objects.length/4) resize(objects.length/2);
		return temp;
	}
	
	public Item sample() {
		return objects[StdRandom.uniform(0, N)];
	}
	
	private void resize(int n) {
		Item[] os = (Item[]) new Object[n];
		for (int i = 0; i < N; i++) {
			os[i] = objects[i];
		}
		objects = os;
	}
	

	

	@Override
	public Iterator<Item> iterator() {
		return new RandomQueueIterator();
	}
	
	
	private class RandomQueueIterator implements Iterator<Item> {

		
		private int index;
		private Item[] os;
		
		RandomQueueIterator() {
			os = Arrays.copyOf(objects, N);
			for (int i = 0; i < N; i++ ) {
				Item temp = os[i];
				int swap = StdRandom.uniform(i, N);
				os[i] = os[swap];
				os[swap] = temp;
			}
		}
		
		@Override
		public boolean hasNext() {
			return index < os.length;
		}

		@Override
		public Item next() {
			return os[index++];
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
