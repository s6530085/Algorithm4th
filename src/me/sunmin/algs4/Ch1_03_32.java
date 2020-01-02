package me.sunmin.algs4;

public class Ch1_03_32<Item> {
	
	@SuppressWarnings("hiding")
	class Node<Item> {
		Item item;
		Node<Item> next;
		
		Node(Item item) {
			this.item = item;
		}
	}
	
	private Node<Item> head;
	private Node<Item> tail;
	
	public void push(Item item) {
		Node<Item> n = new Node<Item>(item);
		if (head == null) {
			head = n;
			tail = n;
		}
		else {
			n.next = head;
			head = n;
		}
	}
	
	public Item pop() {
		if (head == null) return null;
		Node<Item> i = head;
		if (head.next == null) {
			head = null;
			tail = null;
		}
		else {
			head = head.next;
		}
		
		return i.item;
	}
	
	public void enqueue(Item item) {
		Node<Item> n = new Node<Item>(item);
		if (tail == null) {
			head = n;
			tail = n;
		}
		else {
			tail.next = n;
			tail = n;
		}
	}
	
	

}
