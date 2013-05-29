package uk.abstractit.test;

import uk.abstractit.test.speaker.EnglishSpeaker;
import uk.abstractit.test.speaker.ISpeaker;

/**
 * App to convert a number less than one billion to English words
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String arg0 = args[0];
    	long value;
		try {
			value = Long.valueOf(arg0);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Argument needs to be a number and less than a billion");
		}
        Converter converter = new Converter();
        ISpeaker englishSpeaker = new EnglishSpeaker();
        converter.setSpeaker(englishSpeaker);
		String inWords = converter.inWords(value);

        System.out.println(String.format("%s in words is %s ", arg0, inWords ));
    }
}
