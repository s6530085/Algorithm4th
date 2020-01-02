package me.sunmin.algs4;

public class Deque<T> {

	private class Node<T> {
		Node<T> prev;
		Node<T> next;
		T item;
	}
	
	private Node<T> left;
	private Node<T> right;
	private int N;
	public void pushLeft(T t) {
		Node<T> oldLeft = left;
		left = new Node<T>();
		left.item = t;
		left.next = oldLeft;
		if (isEmpty()) right = left;
		N++;
	}
	
	public void pushRight(T t) {
		Node<T> oldRight = right;
		right = new Node<T>();
		right.item = t;
		if (isEmpty()) left = right;
		else oldRight.next = right;
		N++;
	} 

	public T popLeft() {
		if (isEmpty()) return null;
		T l = left.item;
		left = left.next;
		if (size() == 1) right = left;
		N--;
		return l;
	}
	
	public T popRight() {
		if (isEmpty()) return null;
		T r = right.item;
		if (size() == 1) {
			left = null;
			right = null;
		}
		else {
			right.prev.next = null;
		}
		N--;
		return r;
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	
	public int size() {
		return N;
	}
}
