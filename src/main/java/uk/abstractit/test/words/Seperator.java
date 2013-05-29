package uk.abstractit.test.words;

public enum Seperator implements Speakable {
	SPACE(" "),
	AND(" and ");

	private String word;
	
	private Seperator(String word) {
		this.word = word;
	}

	@Override
	public String getWord() {
		return word;
	}

}
