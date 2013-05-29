package uk.abstractit.test.speaker;

import java.util.List;

import uk.abstractit.test.words.Speakable;

public interface ISpeaker {

	String speak(List<Speakable> words);

}
