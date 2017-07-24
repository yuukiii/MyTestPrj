package com.herontech.first;

public interface SinglyLinkedList<T> {

	void add(T element);

	void traverse();

	void reverse();

	boolean isEmpty();
	
	public Node<T> getHead();

}