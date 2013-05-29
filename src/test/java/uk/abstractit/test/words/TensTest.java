package uk.abstractit.test.words;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import uk.abstractit.test.words.Tens;

public class TensTest {

	@Test
	public void testFromIntWithValidInt() {
		assertEquals(Tens.TWENTY, Tens.fromInt(2));
		assertEquals(Tens.EIGHTY, Tens.fromInt(8));
		assertEquals(Tens.NINETY, Tens.fromInt(9));
	}

	@Test
	public void testFromIntWithInValidInt() {
		assertNull(Tens.fromInt(-1));
		assertNull(Tens.fromInt(0));
		assertNull(Tens.fromInt(90));
		assertNull(Tens.fromInt(500));
	}

	@Test
	public void testGetWord() {
		assertEquals("thirty", Tens.THIRTY.getWord());
	}
}
