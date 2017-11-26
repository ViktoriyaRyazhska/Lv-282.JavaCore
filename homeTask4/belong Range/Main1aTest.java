package hw4;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class Main1aTest {

	@Test
	public void testGetNumbers_2() throws NumberFormatException, IOException {
		System.out.println("Test waiting for input 2 numbers");
		assertEquals(2, (Main1a.getNumbers(2)).length);
	}

	@Test
	public void testGetNumbers_0() throws NumberFormatException, IOException {
		assertEquals(0, (Main1a.getNumbers(0)).length);
	}
	
	@Test
	public void testBelongToRangeTrue() throws NumberFormatException, IOException {
		assertTrue(Main1a.belongToRange( (new float[] {2.9f, 4.2f, -1.5f, 0}), -5.0f, 5.0f) );
	}
	
	@Test
	public void testBelongToRangeFalse() throws NumberFormatException, IOException {
		assertFalse(Main1a.belongToRange( (new float[] {2.9f, 5.2f, -1.5f, 0}), -5.0f, 5.0f) );
	}
	
	
	
	
}
