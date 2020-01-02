package me.sunmin.algs4;

public class Stque<T> {

	private Stack<T> st1 = new Stack<T>();
	private Stack<T> st2 = new Stack<T>();
	
	public void enqueue(T t) {
		st1.push(t);
	}
	
	
	public T dequeue() {
		while (st1.size() > 1) {
			st2.push(st1.pop());
		}
		T top = st1.pop();
		while(!st2.isEmpty()) {
			st1.push(st2.pop());
		}
		return top;
	}
	
	public int size() {
		return st1.size();
	}
	
	
	public boolean isEmpty() {
		return st1.isEmpty();
	}
	
}
