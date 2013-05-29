package uk.abstractit.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import uk.abstractit.test.speaker.EnglishSpeaker;
import uk.abstractit.test.speaker.ISpeaker;

public class ConverterTest {
	
	private Converter converter;
	
	@Before
	public void setup() {
		converter = new Converter();
        ISpeaker englishSpeaker = new EnglishSpeaker();
        converter.setSpeaker(englishSpeaker);		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumber() {
		converter.inWords(-1);
	}
	
	@Test
	public void testZero() {
		assertEquals("Zero", converter.inWords(0));
	}
	
	
	@Test
	public void testUnits() {
		assertEquals("one", converter.inWords(1));
		assertEquals("two", converter.inWords(2));
		assertEquals("three", converter.inWords(3));
		assertEquals("four", converter.inWords(4));
		assertEquals("five", converter.inWords(5));
		assertEquals("six", converter.inWords(6));
		assertEquals("seven", converter.inWords(7));
		assertEquals("eight", converter.inWords(8));
		assertEquals("nine", converter.inWords(9));
	}
	
	@Test
	public void testTensUpto20() {
		assertEquals("ten", converter.inWords(10));
		assertEquals("eleven", converter.inWords(11));
		assertEquals("twelve", converter.inWords(12));
		assertEquals("thirteen", converter.inWords(13));
		assertEquals("fourteen", converter.inWords(14));
		assertEquals("fifteen", converter.inWords(15));
		assertEquals("sixteen", converter.inWords(16));
		assertEquals("seventeen", converter.inWords(17));
		assertEquals("eighteen", converter.inWords(18));
		assertEquals("nineteen", converter.inWords(19));
	}
	
	@Test
	public void testTens() {
		assertEquals("twenty", converter.inWords(20));
		assertEquals("thirty", converter.inWords(30));
		assertEquals("forty", converter.inWords(40));
		assertEquals("fifty", converter.inWords(50));
		assertEquals("sixty", converter.inWords(60));
		assertEquals("seventy", converter.inWords(70));
		assertEquals("eighty", converter.inWords(80));
		assertEquals("ninety", converter.inWords(90));
	}
	
	@Test
	public void testTensAndUnits() {
		assertEquals("twenty one", converter.inWords(21));
		assertEquals("thirty five", converter.inWords(35));
		assertEquals("fifty nine", converter.inWords(59));
		assertEquals("ninety nine", converter.inWords(99));
	}
	
	@Test
	public void testHundreds() {
		assertEquals("one hundred", converter.inWords(100));
		assertEquals("five hundred", converter.inWords(500));
		assertEquals("nine hundred", converter.inWords(900));
	}	
	
	@Test
	public void testHundredsTensAndUnits() {
		assertEquals("one hundred and five", converter.inWords(105));
		assertEquals("one hundred and eleven", converter.inWords(111));
		assertEquals("two hundred and thirty two", converter.inWords(232));
		assertEquals("five hundred and twenty", converter.inWords(520));
		assertEquals("nine hundred and ninety nine", converter.inWords(999));
	}	

	
	@Test
	public void testThousands() {
		assertEquals("one thousand", converter.inWords(1000));
		assertEquals("five thousand", converter.inWords(5000));
		assertEquals("nine thousand", converter.inWords(9000));
	}	
	
	@Test
	public void testThousandsHundredsAndUnits() {
		assertEquals("one thousand one hundred and eleven", converter.inWords(1111));
		assertEquals("five thousand and five", converter.inWords(5005));
		assertEquals("nine thousand and ninety", converter.inWords(9090));
	}	
	
	@Test
	public void testMillions() {
		assertEquals("one million", converter.inWords(1000000));
		assertEquals("one hundred million", converter.inWords(100000000));
		assertEquals("one thousand million", converter.inWords(1000000000));
		assertEquals("nine thousand million", converter.inWords(9000000000L));
	}	
	@Test
	public void testRandomNumber() {
		assertEquals("sixty five thousand", converter.inWords(65000L));
		assertEquals("seventy seven million seven hundred and seventy seven thousand seven hundred and seventy seven", 
				converter.inWords(77777777L));
		assertEquals("seven hundred and seventy seven thousand seven hundred and seventy seven", 
				converter.inWords(777777L));
		assertEquals("one hundred and twenty three million four hundred and fifty six thousand seven hundred and eighty nine", 
				converter.inWords(123456789L));
	}	
	
}
