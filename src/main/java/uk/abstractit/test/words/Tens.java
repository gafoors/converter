package uk.abstractit.test.words;

public enum Tens implements Speakable {
	TWENTY(2, "twenty"),
	THIRTY(3, "thirty"),
	FORTY(4, "forty"),
	FIFTY(5, "fifty"),
	SIXTY(6, "sixty"),
	SEVENTY(7, "seventy"),
	EIGHTY(8, "eighty"),
	NINETY(9, "ninety");
	
	
	private int intValue;
	private String word;
	
	private Tens(int intValue, String word) {
		this.intValue = intValue;
		this.word = word;
	}

	@Override
	public String getWord() {
		return word;
	}
	
	public static Tens fromInt(int i) {
		for(Tens tens : Tens.values()) {
			if(tens.intValue == i) {
				return tens;
			}
		}
		return null;
	}
}
