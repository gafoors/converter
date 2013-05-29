package uk.abstractit.test.words;


public enum Group implements Speakable {
	HUNDRED("hundred"),
	THOUSAND("thousand"),
	MILLION("million");
	
	private String word;
	
	private Group(String word) {
		this.word = word;
	}

	@Override
	public String getWord() {
		return word;
	}

}
