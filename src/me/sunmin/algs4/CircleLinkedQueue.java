package me.sunmin.algs4;

public class CircleLinkedQueue<Item> {

//	private Node<Item> first;
	private Node<Item> last;
	private int N;
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node<Item> oldLast = last;
		last = new Node<Item>();
		last.item = item;
		last.next = last;
		if (!isEmpty()) {
			last.next = oldLast.next;
			oldLast.next = last;
		}
		N++;
	}
	
	
	public Item dequeue() {
		Node<Item> oldFirst = last.next;
		last.next = oldFirst.next;
		N--;
		if (isEmpty()) last = null;
		return oldFirst.item;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
