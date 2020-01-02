package me.sunmin.algs4;

public class Ch1_04_28<T> {

	private Queue<T> queue = new Queue<T>();
	
	public void push(T t) {
		queue.enqueue(t);
	}
	
	public T pop() {
		int count = queue.size();
		for (int i = 0; i < count-1; i++) {
			T temp = queue.dequeue();
			queue.enqueue(temp);
		}
		T top = queue.dequeue();
		return top;
	}
	
}
