package com.herontech.first;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.herontech.first.SinglyLinkedList;
import com.herontech.first.SinglyLinkedListImpl;

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
		assertFalse(sl.isEmpty()); // linked list should not be empty
	}

	@Test
	public void testTraverse() {
		try {
			sl.traverse();
			assertEquals(new Integer(3), sl.getHead().getValue()); //get the first integer 
			assertEquals(new Integer(32), sl.getHead().getNextRef().getValue()); //get the next integer
		} catch (ObjectNotFoundException e) {
			fail(e.getMessage());
		}
		
	}

	@Test
	public void testReverse() {
		try {
			sl.reverse(); // reverse the list 
			assertEquals(new Integer(89), sl.getHead().getValue()); // the lsst will be first
			assertEquals(new Integer(54), sl.getHead().getNextRef().getValue()); // the second to last will be second
			sl.reverse(); // reverse the reversed list for next test
		} catch (SinglyLinkedListException e) {
			fail(e.getMessage());
		}
		
	}

}
