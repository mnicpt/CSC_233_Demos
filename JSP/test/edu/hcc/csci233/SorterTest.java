package edu.hcc.csci233;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SorterTest {

	private Sorter sorter;
	private char[] array1 = {'a', 'b', 'c', '\0'};
	private char[] array2 = {'d', 'e', 'f', 'g', '\0'};
	private char[] array3 = {'d', 'e', 'f', 'g', '\0'};
	
	@Before
	public void setUp() throws Exception {
		sorter = new Sorter();
	}

	@After
	public void tearDown() throws Exception {
		sorter = null;
	}

	@Test
	public void sorterReturns0IfEqual() {
		assertEquals(0, sorter.sortCharacterArray(array2, array3));
	}

	@Test
	public void sorterReturns2IfInOrder() {
		assertEquals(1, sorter.sortCharacterArray(array1, array2));
	}
	
	@Test
	public void sorterReturns1IfOutOfOrder() {
		assertEquals(-1, sorter.sortCharacterArray(array2, array1));
	}

}
