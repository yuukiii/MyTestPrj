package com.herontech.first;

public interface SinglyLinkedList<T> {

	void add(T element);

	void traverse() throws ObjectNotFoundException;

	void reverse() throws SinglyLinkedListException;

	boolean isEmpty();
	
	public Node<T> getHead();

}