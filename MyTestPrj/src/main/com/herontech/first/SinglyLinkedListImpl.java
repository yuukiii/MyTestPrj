/**
 * 
 */
package com.herontech.first;

/**
 * @author garfield
 * 
 */
public class SinglyLinkedListImpl<T> implements SinglyLinkedList<T> {

	private Node<T> head;

	/**
	 * @return the head
	 */
	@Override
	public Node<T> getHead() {
		return head;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.herontech.first.SinglyLinkedList#add(T)
	 */
	@Override
	public void add(final T element) {
		Node<T> nd = new Node<T>();
		nd.setValue(element);
		System.out.println("Adding: " + element);
		Node<T> tmp = head;
		while (true) {
			if (tmp == null) {
				// since there is only one element, both head and
				// tail points to the same object.
				head = nd;
				break;
			} else if (tmp.getNextRef() == null) {
				tmp.setNextRef(nd);
				break;
			} else {
				tmp = tmp.getNextRef();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.herontech.first.SinglyLinkedList#traverse()
	 */
	@Override
	public void traverse() throws ObjectNotFoundException{

		Node<T> tmp = head;
		if (tmp == null) {
			throw new ObjectNotFoundException(); 
		}
		while (tmp!=null) {
			System.out.print(tmp.getValue() + "\t");
			tmp = tmp.getNextRef();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.herontech.first.SinglyLinkedList#reverse()
	 */
	@Override
	public void reverse() throws SinglyLinkedListException {

		System.out.println("\nreversing the linked list\n");
		Node<T> prev = null;
		Node<T> current = head;
		Node<T> next = null;
		if (current == null) {
			throw new SinglyLinkedListException(); 
		}
		while (current != null) {
			next = current.getNextRef();
			current.setNextRef(prev);
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(final String a[]) {
		try{
			SinglyLinkedList<Integer> sl = new SinglyLinkedListImpl<Integer>();
		
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);
		System.out.println();
		sl.traverse();
		System.out.println();
		sl.reverse();
		sl.traverse();
		}catch(ObjectNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SinglyLinkedListException e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public boolean isEmpty() {
		 
		return length()==0;
	}
	
	 public int length() {
	       int length = 0;
	       Node<T> current = head;  // Starts counting from head - first node
	       while(current != null){
	           length ++;
	           current = current.getNextRef();
	       }
	       return length;
	    }

}

/**
 * @author garfieldheron
 *
 * @param <T>
 */
class Node<T> implements Comparable<T> {

	private T value;
	private Node<T> nextRef;

	public T getValue() {
		return value;
	}

	public void setValue(final T value) {
		this.value = value;
	}

	public Node<T> getNextRef() {
		return nextRef;
	}

	public void setNextRef(final Node<T> ref) {
		this.nextRef = ref;
	}

	@Override
	public int compareTo(final T arg) {
		if (arg == this.value) {
			return 0;
		} else {
			return 1;
		}
	}
}