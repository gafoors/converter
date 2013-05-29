package uk.abstractit.test.speaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Before;
import org.junit.Test;

import uk.abstractit.test.words.Speakable;

public class EnglishSpeakerTest {

	private ISpeaker speaker;
	
	@Before
	public void setup() {
		speaker = new EnglishSpeaker();
	}
	
	@Test
	public void testSpeakWithNull() {
		assertNull(speaker.speak(null));
	}

	@Test
	public void testSpeakWithNoWords() {
		assertNull(speaker.speak(Collections.<Speakable> emptyList()));
	}
	
	@Test
	public void testSpeakWithSingleWord() {
		Speakable speakable = new MockSpeakable("Hello"); 
		assertEquals("Hello", speaker.speak(Collections.singletonList(speakable)));
	}
	
	@Test
	public void testSpeakWithManyWords() {
		Speakable hello = new MockSpeakable("Hello ");
		Speakable world = new MockSpeakable("World");
		assertEquals("Hello World", speaker.speak(Arrays.asList(hello, world)));
	}
	
	public class MockSpeakable implements Speakable {

		private String word;
		
		private MockSpeakable(String word) {
			this.word = word;
		}

		@Override
		public String getWord() {
			return word;
		}
}
}
