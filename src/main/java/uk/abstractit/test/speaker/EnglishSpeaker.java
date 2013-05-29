package uk.abstractit.test.speaker;

import java.util.List;

import uk.abstractit.test.words.Speakable;

public class EnglishSpeaker implements ISpeaker {

	@Override
	public String speak(List<Speakable> words) {
		if(words == null || words.isEmpty()) {
			return null;
		}
		StringBuilder builder = new StringBuilder();
		for (Speakable word : words) {
			builder.append(word.getWord());
		}
		return builder.toString();
	}

}
