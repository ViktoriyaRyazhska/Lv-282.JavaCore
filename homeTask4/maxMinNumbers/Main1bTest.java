package hw4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Main1bTest {

//	Testing for minimal value
	
	@Test
	public void testMinValueFirst() {
		assertEquals(0, Main1b.minValue(new int[] {1, 6, 2, 3}));
	}

	@Test
	public void testMinValueMiddle() {
		assertEquals(2, Main1b.minValue(new int[] {11, 6, 2, 3}));
	}
	
	@Test
	public void testMinValueLast() {
		assertEquals(3, Main1b.minValue(new int[] {3, 5, 2, 1}));
		
	}

// Testing for maximum value	
	
	@Test
	public void testMaxValueFirst() {
		assertEquals(0, Main1b.maxValue(new int[] {11, 6, 2, 3}));
	}

	@Test
	public void testMaxValueMiddle() {
		assertEquals(2, Main1b.maxValue(new int[] {11, 6, 12, 3}));
	}
	
	@Test
	public void testMaxValueLast() {
		assertEquals(3, Main1b.maxValue(new int[] {3, 5, 2, 13}));
		
	}
	
	
	
}
