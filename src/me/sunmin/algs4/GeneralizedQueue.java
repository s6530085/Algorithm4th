package me.sunmin.algs4;

public class GeneralizedQueue<Item> {

	private int N;
	private Item[] objects = (Item[]) new Object[1];
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public void insert(Item item) {
		objects[N++] = item;
		if (N == objects.length) resize(N*2);
	}
	
	public Item delete(int k) {
		Item temp = objects[k];
		for (int i = k+1; i < N; i++) {
			objects[i-1] = objects[i];
		}
		objects[N-1] = null;
		N--;
		if (N > 0 && N == objects.length/4) resize(objects.length/2);
		return temp;
	}
	
	private void resize(int n) {
		Item[] os = (Item[]) new Object[n];
		for (int i = 0; i < N; i++) {
			os[i] = objects[i];
		}
		objects = os;
	}
	
	public static void main(String[] args) {
		
	}

}
