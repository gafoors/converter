package uk.abstractit.test.words;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uk.abstractit.test.words.Group;

public class GroupTest {
	@Test
	public void testGetWord() {
		assertEquals("hundred", Group.HUNDRED.getWord());
		assertEquals("thousand", Group.THOUSAND.getWord());
		assertEquals("million", Group.MILLION.getWord());
	}
}
