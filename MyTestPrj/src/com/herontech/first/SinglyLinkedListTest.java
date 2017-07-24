package com.herontech.first;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SinglyLinkedListTest {

	static SinglyLinkedList<Integer> sl = new SinglyLinkedListImpl<Integer>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		sl.add(3);
		sl.add(32);
		sl.add(54);
		sl.add(89);

	}

	@Test
	public void testAdd() {
		assertFalse(sl.isEmpty());

	}

	@Test
	public void testTraverse() {
		sl.traverse();
		System.out.println(sl.getHead().getNextRef().getValue());
		System.out.println(sl.getHead().getValue());
		assertEquals(new Integer(3), sl.getHead().getValue() ); 
		assertEquals(new Integer(32), sl.getHead().getNextRef().getValue() ); 
	}

	@Test
	public void testReverse() {
		sl.reverse();
		System.out.println(sl.getHead().getNextRef().getValue());
		System.out.println(sl.getHead().getValue());
		assertEquals(new Integer(89), sl.getHead().getValue() ); 
		assertEquals(new Integer(54), sl.getHead().getNextRef().getValue() ); 
		sl.reverse();
	}

}
