package myFirstArrayList;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListTest {
	
	static VinArrayList vin = new VinArrayList();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		vin.initialze();
	}

	@Test
	public void testProgram() {
		assertTrue(vin.add(1));
		assertEquals(1, vin.get(1));
		for (int i = 2; i <= 10; i++) {
			vin.add(i);
		}
		assertEquals(10, vin.get(9));
		assertTrue(vin.add(99));
		assertEquals(99, vin.get(10));
	}

}
