package uk.abstractit.test;

import java.util.ArrayList;
import java.util.List;

import uk.abstractit.test.speaker.ISpeaker;
import uk.abstractit.test.words.Group;
import uk.abstractit.test.words.Seperator;
import uk.abstractit.test.words.Speakable;
import uk.abstractit.test.words.Tens;
import uk.abstractit.test.words.Units;

public class Converter {

	private ISpeaker speaker;
	
	public String inWords(long i) {
		List<Speakable> words = new ArrayList<Speakable>();
		if (i < 0) {
			throw new IllegalArgumentException("Connot speak negative numbers");
		} else
			getWords(i, words);
		return speaker.speak(words);
	}

	private List<Speakable> getWords(long i, List<Speakable> words) {
		if (words.size() > 0) {
			words.add(Seperator.SPACE);
		}
		int iRemains = getMillions(i, words);
		getFromThousands(iRemains, words);

		return words;
	}

	private void getFromThousands(int iRemains, List<Speakable> words) {
		iRemains = getThousands(iRemains, words);
		iRemains = getHundreds(iRemains, words);
		getTensAndUnits(iRemains, words);
	}
	
	private int getMillions(long i, List<Speakable> words) {
		int millions = (int) (i / 1000000);
		
		if (i >= 1000000) {
			getFromThousands(millions, words);
			words.add(Seperator.SPACE);
			words.add(Group.MILLION);
			i = i - (millions * 1000000);
		}
		return (int) i;
	}

	private int getThousands(long i, List<Speakable> words) {
		int thousand = (int) (i / 1000);

		if (i >= 1000) {
			int hundred = getHundreds(thousand, words);
			getTensAndUnits(hundred, words);
			words.add(Seperator.SPACE);
			words.add(Group.THOUSAND);
			i = i - (thousand * 1000);
		}
		return (int) i;
	}

	private int getHundreds(int i, List<Speakable> words) {
		int hundred = i / 100;
		if (i >= 100) {
			int size = words.size();

			if (size > 0 ) {
					words.add(Seperator.SPACE);
			}
			words.add(Units.fromInt(hundred));
			words.add(Seperator.SPACE);
			words.add(Group.HUNDRED);
			i = i - (hundred * 100);
		}
		return i;
	}

	private void getTensAndUnits(int i, List<Speakable> words) {
		int tens = i / 10;
		int remainder = i % 10;
		int size = words.size();

		if (size > 0 && words.get(size - 1) instanceof Group) {
			if (i > 0) {
				words.add(Seperator.AND);
			} else {
				return;
			}
		}
		switch (tens) {
		case 0:
		case 1:
			words.add(Units.fromInt(i));
			break;
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			words.add(Tens.fromInt(tens));
			if (remainder != 0) {
				getWords(remainder, words);
			}
			break;
		}
	}

	public void setSpeaker(ISpeaker speaker) {
		this.speaker = speaker;
	}
}
