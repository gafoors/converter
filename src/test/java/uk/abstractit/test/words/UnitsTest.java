package uk.abstractit.test.words;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import uk.abstractit.test.words.Units;

public class UnitsTest {

	@Test
	public void testFromIntWithValidInt() {
		assertEquals(Units.ZERO, Units.fromInt(0));
		assertEquals(Units.EIGHT, Units.fromInt(8));
		assertEquals(Units.NINETEEN, Units.fromInt(19));
	}

	@Test
	public void testFromIntWithInValidInt() {
		assertNull(Units.fromInt(-1));
		assertNull(Units.fromInt(20));
	}
	
	@Test
	public void testGetWord() {
		assertEquals("eighteen", Units.EIGHTEEN.getWord());
	}
}
