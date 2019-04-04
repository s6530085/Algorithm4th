package me.sunmin.algs4;

public class RingBuffer<Item> {
	
	private int readIndex;
	private int writeIndex;
	private Item[] objects;
	
	public RingBuffer(int capacity) {
		objects = (Item[]) new Object[capacity];
		readIndex = 0;
		writeIndex = 0;
	}
	
//	public boolean write(Item item) {
//		
//	}
//	
//	public boolean write(Item[] items) {
//		
//	}
//	
//	public Item read() {
//		
//	}
//	
//	
//	
	

}
